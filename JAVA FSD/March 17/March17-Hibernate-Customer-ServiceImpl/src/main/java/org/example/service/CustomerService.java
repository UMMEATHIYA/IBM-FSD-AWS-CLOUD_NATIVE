package org.example.service;

import org.example.entity.Customer;

import java.util.List;

public interface CustomerService {
    public void createCustomer(Customer customer);


    public List<Customer> getAllCustomer();
    public Customer getCustomerById(int customerId);
    public List<Customer> getCustomerByName(String name);
    public Customer updateCustomer(int customerId);
    public Customer deleteCustomer(int customerID);

}