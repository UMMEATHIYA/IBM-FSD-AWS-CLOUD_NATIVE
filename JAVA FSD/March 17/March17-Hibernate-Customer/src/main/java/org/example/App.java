package org.example;

/**
 * Hello world!
 *
 */
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try {

            SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
            Session session=factory.openSession();
            session.getTransaction().begin();
            session.save(new Customer(1,"John"));
            session.getTransaction().commit();
            System.out.println("customer created.");


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
