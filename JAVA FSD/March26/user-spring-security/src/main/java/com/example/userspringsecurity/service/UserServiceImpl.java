package com.example.userspringsecurity.service;

import com.example.userspringsecurity.dto.UserDto;
import com.example.userspringsecurity.model.UserModel;
import com.example.userspringsecurity.repo.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        // TODO Auto-generated method stub
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserModel model = mapper.map(userDto, UserModel.class);
        userRepository.save(model);
        UserDto dto= mapper.map(model, UserDto.class);
        return dto;
    }

    @Override

    public UserDto findByUserId(String userId) {
        // TODO Auto-generated method stub
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserModel model=userRepository.findByUserId(userId);
        if(model==null)
        {
            return null;
        }
        else
        {
            UserDto dto=mapper.map(model, UserDto.class);
            return dto;
        }

    }

    @Override

    public UserDto findByEmail(String email) {
        // TODO Auto-generated method stub
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserModel model=userRepository.findByEmail(email);
        System.out.println(model);


        return (mapper.map(model, UserDto.class));
    }

    //get account by id
    @Override
    public List<UserModel> getAllUserDetails() {
        return userRepository.findAll();
    }

    @Override
    public UserModel updateUser(String userId, UserDto userDto) {

        UserModel userModel = userRepository.findByUserId(userId);
        userModel.setFirstName(userDto.getFirstName());
        userModel.setLastName(userDto.getLastName());
        userModel.setEmail(userDto.getEmail());
        ModelMapper mapper = new ModelMapper();
        UserModel model = mapper.map(userDto, UserModel.class);
        return userRepository.save(model);
    }

    @Override
    @Transactional
    public Integer deleteByUserId(String userId) {
        return userRepository.deleteByUserId(userId);
    }



    @Override
    public List<UserModel> getUserByFirstName(String firstName) {
        // TODO Auto-generated method stub
        List<UserModel> users=userRepository.findByFirstName(firstName);
        return users;
    }
}
