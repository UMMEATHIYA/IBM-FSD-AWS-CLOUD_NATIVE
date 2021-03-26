package com.example.userspringsecurity.Controller;


import com.example.userspringsecurity.Exception.EmailNotFoundException;
import com.example.userspringsecurity.Exception.UserNotFoundException;
import com.example.userspringsecurity.dto.UserDto;
import com.example.userspringsecurity.model.UserModel;
import com.example.userspringsecurity.service.UserService;
import com.example.userspringsecurity.shared.UserRequestModel;
import com.example.userspringsecurity.shared.UserResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }


    @PostMapping("/users")
    public ResponseEntity<UserResponseModel> createUser(@RequestBody UserRequestModel userRequestModel)
    {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDto=mapper.map(userRequestModel, UserDto.class);
        userDto.setUserId(UUID.randomUUID().toString());
        UserDto response= userService.createUser(userDto);
        UserResponseModel model=mapper.map(response, UserResponseModel.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);

    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<UserResponseModel> getAccountByUserId(@PathVariable("userId") String userId)
    {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto dto=userService.findByUserId(userId);
        if(dto==null)
        {
            throw new UserNotFoundException("no such user with id: "+userId);
        }
        UserResponseModel response=mapper.map(dto, UserResponseModel.class);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/users/email/{email}")
    public ResponseEntity<UserDto> findUserByEmail(@PathVariable("email") String email)
    {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto dto=userService.findByEmail(email);
        if(dto==null)
        {
            throw new EmailNotFoundException("email not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }


    //get all the details
    @GetMapping("/users/details")
    public List<UserDto> getAllUserDetails() {
        ModelMapper mapper=new ModelMapper();
        return userService.getAllUserDetails().stream().map(post -> mapper.map(post, UserDto.class))
                .collect(Collectors.toList());
    }


    //update
    @PutMapping("/users/{userId}")
    public ResponseEntity<UserResponseModel> updateUser(@PathVariable String userId, @RequestBody UserRequestModel userRequestModel) {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDto1 = mapper.map(userRequestModel, UserDto.class);
        UserModel response = userService.updateUser(userId, userDto1);

        // entity to DTO
        UserResponseModel model = mapper.map(response, UserResponseModel.class);

        return ResponseEntity.ok().body(model);
    }


    @DeleteMapping("/users/{userId}")
    public ResponseEntity<Integer> deleteUser(@PathVariable("userId") String userId) {

        Integer result=userService.deleteByUserId(userId);
        if(result<1)
        {
            throw new UserNotFoundException("no account found.");
        }
        return ResponseEntity.ok(result);

    }

    @GetMapping("/users/firstName/{firstName}")
    public ResponseEntity<List<UserResponseModel>> getByfirstName(@PathVariable("firstName") String firstName)
    {
        List<UserModel> list=userService.getUserByFirstName(firstName);
        List<UserResponseModel> responses=new ArrayList<UserResponseModel>();
        Iterator<UserModel> i=list.iterator();
        while(i.hasNext())
        {
            UserModel m=i.next();
            UserResponseModel model=new UserResponseModel();
            model.setUserId(m.getUserId());
            model.setEmail(m.getEmail());
            model.setFirstName(m.getFirstName());
            model.setLastName(m.getLastName());
            responses.add(model);
        }
        return ResponseEntity.ok(responses);
    }

}