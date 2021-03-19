package org.example;

import org.example.model.InstructorDetail;
import org.example.model.Student;
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
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
        Session session=factory.openSession();
        Student tempStudent = new Student("Chad", "Darby", "darby@luv2code.com");
        InstructorDetail tempInstructorDetail = new InstructorDetail("Sheena", "Economics");
        tempStudent.setInstructorDetail(tempInstructorDetail);
        session.getTransaction().begin();
        session.save(tempStudent);
        session.getTransaction().commit();
    }
}
