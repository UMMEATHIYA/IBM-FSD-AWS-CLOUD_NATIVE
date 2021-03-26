package com.example.springsecuritymodel.repo;

import com.example.springsecuritymodel.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
