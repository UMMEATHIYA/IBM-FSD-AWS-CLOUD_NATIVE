package com.example.accountservice.service;


import com.example.accountservice.dto.AccountDto;
import com.example.accountservice.model.AccountModel;

import java.util.List;

public interface AccountService {
        public AccountDto createAccount(AccountDto accountDto);
        public AccountDto findByAccountId(String accountId);
        public AccountDto findByEmail(String email);
        public List<AccountModel> getAllAccountDetails();
        public AccountModel updateAccount(String accountId, AccountDto accountDto);
        public Integer deleteByAccountId(String accountId);
        public List<AccountModel> getAccountByFirstName(String firstName);
}
