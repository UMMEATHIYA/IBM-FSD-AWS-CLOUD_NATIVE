package org.example.dao;

import org.example.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccountDaoImpl implements AccountDao{
    private SessionFactory sessionFactory;
    private Session session;
    {
        sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class).buildSessionFactory();
    }

    @Override
    public void createAccount(Account account) {

        try{
            session=sessionFactory.openSession();
            session.getTransaction().begin();
            session.save(account);
            session.getTransaction().commit();
        }
        catch(Exception e)
        {
            System.out.println("duplicate id.");
        }


    }
}