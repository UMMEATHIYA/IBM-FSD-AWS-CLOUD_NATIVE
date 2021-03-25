package com.example.accountservice.repo;

import com.example.accountservice.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel, Integer> {
    @Query
    public AccountModel findByAccountId(String accountId);
    @Query
    public AccountModel findByEmail(String email);
    @Query
    public AccountModel findByLastName(String last_name);
    @Query
    public Integer deleteByAccountId(String accountId);
    @Query
    public List<AccountModel> findByFirstName(String firstName);
}
