package org.example.dao;

import org.example.entity.Customer;
import org.example.exception.CustomerNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class CustomerDaoImpl implements CustomerDao {
    private SessionFactory sessionFactory;
    private Session session;

    {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
    }

    @Override
    public void createCustomer(Customer customer) {

        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.save(customer);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("duplicate id.");
        }


    }

    @Override
    public List<Customer> getAllCustomer() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM Customer");
        return query.getResultList();
    }

    public Customer getCustomerById(int customerId) {
        session = sessionFactory.openSession();
        Customer customer = session.find(Customer.class, customerId);
        if (customer == null) {
            return null;
        }
        return customer;
    }

    public List<Customer> getCustomerByName(String name) {
        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM Customer c where c.customerName=?1");
        query.setParameter(1,name);
        return query.getResultList();
    }

    public Customer deleteCustomer(int customerID) {
            Transaction tx = session.beginTransaction();
            session = sessionFactory.openSession();
            Customer customer2 = session.get(Customer.class, customerID);
            session.delete(customer2);
            tx.commit();
        if (customer2 == null) {
            return null;
        }
        return customer2;

    }

    public Customer updateCustomer(int customerId) {
        session=sessionFactory.openSession();
        Customer customer=session.get(Customer.class,customerId);
        if(customer==null)
        {
            throw new CustomerNotFoundException("no customer found.");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.print("NAME: ");
        String name = scanner.next();
        customer.setCustomerName(name);
        session.getTransaction().begin();
        session.merge(customer);
        session.getTransaction().commit();
        return customer;
    }

}

