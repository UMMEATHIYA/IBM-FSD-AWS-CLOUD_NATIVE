package com.example.userspringsecurity.repo;


import com.example.userspringsecurity.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
    @Query
    public UserModel findByUserId(String userId);
    @Query
    public UserModel findByEmail(String email);
    @Query
    public UserModel findByLastName(String last_name);
    @Query
    public Integer deleteByUserId(String userId);
    @Query
    public List<UserModel> findByFirstName(String firstName);
}
