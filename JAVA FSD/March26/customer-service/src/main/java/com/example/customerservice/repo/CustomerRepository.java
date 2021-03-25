package com.example.customerservice.repo;

import com.example.customerservice.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {
    @Query
    public CustomerModel findByAccountId(String accountId);
    @Query
    public CustomerModel findByEmail(String email);
    @Query
    public CustomerModel findByLastName(String last_name);
    @Query
    public Integer deleteByAccountId(String accountId);
    @Query
    public List<CustomerModel> findByFirstName(String firstName);

    //displaying details through first name and last name
    @Query(value="select * from CUSTOMER_DETAILS e where e.first_name=? and e.last_name = ?", nativeQuery = true)
    public List<CustomerModel> findByFirstandLastNameIgnoreCase(String firstName, String lastName);

    //displaying details through first name or last name
    @Query(value="select * from CUSTOMER_DETAILS e where e.first_name=? or e.last_name = ?", nativeQuery = true)
    public List<CustomerModel> findByFirstorLastNameIgnoreCase(String firstName, String lastName);
}
