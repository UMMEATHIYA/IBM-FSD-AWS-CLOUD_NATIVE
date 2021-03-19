package org.example;

/**
 * Hello world!
 *
 */
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String args[]){
   try {

    SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class).buildSessionFactory();
    Session session=factory.openSession();
    Student student=new Student(new Random().nextInt(1000), "David", "Brue",
            "david@email.com");
    /*
     * System.out.println(student); session.getTransaction().begin();
     * session.save(student); session.getTransaction().commit();
     * System.out.println(student);
     * System.out.println("one item saved sucessfully..");
     */
    Student s=session.get(Student.class, 10);
    System.out.println(s);



} catch (Exception e) {
       // TODO: handle exception
       e.printStackTrace();
         }
    }
}
