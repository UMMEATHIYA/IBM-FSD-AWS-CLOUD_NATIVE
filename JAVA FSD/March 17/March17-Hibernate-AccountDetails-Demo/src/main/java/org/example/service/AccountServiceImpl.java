package org.example.service;
import org.example.dao.AccountDao;
import org.example.dao.AccountDaoImpl;
import org.example.entity.Account;

public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;
    {
        accountDao=new AccountDaoImpl();
    }
    @Override
    public void createAccount(Account account) {
        accountDao.createAccount(account);
    }
}
