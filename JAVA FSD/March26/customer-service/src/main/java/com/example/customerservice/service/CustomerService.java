package com.example.customerservice.service;

import com.example.customerservice.dto.CustomerDto;
import com.example.customerservice.model.CustomerModel;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface  CustomerService {
    public CustomerDto createCustomer(CustomerDto accountDto);
    public CustomerDto findByCustomerId(String accountId);
    public CustomerDto findByEmail(String email);
    public List<CustomerModel> getAllCustomerDetails();
    public CustomerModel updateCustomer(String accountId, CustomerDto accountDto);
    public Integer deleteByCustomerId(String accountId);
    public List<CustomerModel> getCustomerByFirstName(String firstName);

    //first and last name
    public List<CustomerModel> findByFirstandLastNameIgnoreCase(String firstName, String lastName);

    //first or last name
    public List<CustomerModel> findByFirstorLastNameIgnoreCase(String firstName, String lastName);
}
