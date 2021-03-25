package com.example.accountservice.service;

import com.example.accountservice.dto.AccountDto;
import com.example.accountservice.model.AccountModel;
import com.example.accountservice.repo.AccountRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        super();
        this.accountRepository = accountRepository;
    }

    @Override

    public AccountDto createAccount(AccountDto accountDto) {
        // TODO Auto-generated method stub
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AccountModel model = mapper.map(accountDto, AccountModel.class);
        accountRepository.save(model);
        AccountDto dto= mapper.map(model, AccountDto.class);
        return dto;
    }

    @Override

    public AccountDto findByAccountId(String accountId) {
        // TODO Auto-generated method stub
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AccountModel model=accountRepository.findByAccountId(accountId);
        if(model==null)
        {
            return null;
        }
        else
        {
            AccountDto dto=mapper.map(model, AccountDto.class);
            return dto;
        }

    }

    @Override

    public AccountDto findByEmail(String email) {
        // TODO Auto-generated method stub
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AccountModel model=accountRepository.findByEmail(email);
        System.out.println(model);


        return (mapper.map(model, AccountDto.class));
    }

    //get account by id
    @Override
    public List<AccountModel> getAllAccountDetails() {
        return accountRepository.findAll();
    }

    @Override
    public AccountModel updateAccount(String accountId, AccountDto accountDto) {

        AccountModel accountModel = accountRepository.findByAccountId(accountId);
        accountModel.setFirstName(accountDto.getFirstName());
        accountModel.setLastName(accountDto.getLastName());
        accountModel.setEmail(accountDto.getEmail());
        ModelMapper mapper = new ModelMapper();
        AccountModel model = mapper.map(accountDto, AccountModel.class);
        return accountRepository.save(model);
    }

    @Override
    @Transactional
    public Integer deleteByAccountId(String accountId) {
        return accountRepository.deleteByAccountId(accountId);
    }



    @Override
    public List<AccountModel> getAccountByFirstName(String firstName) {
        // TODO Auto-generated method stub
        List<AccountModel> accounts=accountRepository.findByFirstName(firstName);
        return accounts;
    }
}
