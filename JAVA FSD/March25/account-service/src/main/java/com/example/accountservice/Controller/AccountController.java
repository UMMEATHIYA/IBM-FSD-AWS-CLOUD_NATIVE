package com.example.accountservice.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.example.accountservice.Exception.AccountNotFoundException;
import com.example.accountservice.Exception.EmailNotFoundException;
import com.example.accountservice.dto.AccountDto;
import com.example.accountservice.model.AccountModel;
import com.example.accountservice.service.AccountService;
import com.example.accountservice.shared.AccountRequestModel;
import com.example.accountservice.shared.AccountResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class AccountController {
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        super();
        this.accountService = accountService;
    }


    @PostMapping("/accounts")
    public ResponseEntity<AccountResponseModel> createAccount(@RequestBody AccountRequestModel accRequestModel)
    {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AccountDto accountDto=mapper.map(accRequestModel, AccountDto.class);
        accountDto.setAccountId(UUID.randomUUID().toString());
        AccountDto response= accountService.createAccount(accountDto);
        AccountResponseModel model=mapper.map(response, AccountResponseModel.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);

    }
    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<AccountResponseModel> getAccountByAccountId(@PathVariable("accountId") String accountId)
    {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AccountDto dto=accountService.findByAccountId(accountId);
        if(dto==null)
        {
            throw new AccountNotFoundException("no such account with id: "+accountId);
        }
        AccountResponseModel response=mapper.map(dto, AccountResponseModel.class);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/accounts/email/{email}")
    public ResponseEntity<AccountDto> findAccountByEmail(@PathVariable("email") String email)
    {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AccountDto dto=accountService.findByEmail(email);
        if(dto==null)
        {
            throw new EmailNotFoundException("email not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }


    //get all the details
    @GetMapping("/accounts/details")
    public List<AccountDto> getAllAccountDetails() {
        ModelMapper mapper=new ModelMapper();
        return accountService.getAllAccountDetails().stream().map(post -> mapper.map(post, AccountDto.class))
                .collect(Collectors.toList());
    }


    //update
    @PutMapping("/accounts/{accountId}")
    public ResponseEntity<AccountResponseModel> updateAccount(@PathVariable String accountId, @RequestBody AccountRequestModel accountRequestModel) {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AccountDto accountDto1 = mapper.map(accountRequestModel, AccountDto.class);
        AccountModel response = accountService.updateAccount(accountId, accountDto1);

        // entity to DTO
        AccountResponseModel model = mapper.map(response, AccountResponseModel.class);

        return ResponseEntity.ok().body(model);
    }


    @DeleteMapping("/accounts/{accountId}")
    public ResponseEntity<Integer> deleteAccount(@PathVariable("accountId") String accountId) {

        Integer result=accountService.deleteByAccountId(accountId);
        if(result<1)
        {
            throw new AccountNotFoundException("no account found.");
        }
        return ResponseEntity.ok(result);

    }

    @GetMapping("/accounts/firstName/{firstName}")
    public ResponseEntity<List<AccountResponseModel>> getByfirstName(@PathVariable("firstName") String firstName)
    {
        List<AccountModel> list=accountService.getAccountByFirstName(firstName);
        List<AccountResponseModel> responses=new ArrayList<AccountResponseModel>();
        Iterator<AccountModel> i=list.iterator();
        while(i.hasNext())
        {
            AccountModel m=i.next();
            AccountResponseModel model=new AccountResponseModel();
            model.setAccountId(m.getAccountId());
            model.setEmail(m.getAccountId());
            model.setFirstName(m.getFirstName());
            model.setLastName(m.getLastName());
            responses.add(model);
        }
        return ResponseEntity.ok(responses);
    }

}