package org.example.service;

import org.example.dao.CustomerDao;
import org.example.dao.CustomerDaoImpl;
import org.example.entity.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;
    {
        customerDao=new CustomerDaoImpl();
    }
    @Override
    public void createCustomer(Customer customer) {
        customerDao.createCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }
    public Customer getCustomerById(int customerId){
        return customerDao.getCustomerById(customerId);
    }

    public List<Customer> getCustomerByName(String name){
        return customerDao.getCustomerByName(name);
    }
    public Customer deleteCustomer(int customerID){
        return customerDao.deleteCustomer(customerID);
    }
    public Customer updateCustomer(int customerId) {
        return customerDao.updateCustomer(customerId);
    }
}
