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
        Student tempStudent = new Student("Yash","Raj","yash@gmail.com");
        InstructorDetail tempInstructor = new InstructorDetail("Samual", "Maths");
        tempStudent.setInstructorDetail(tempInstructor);
        session.getTransaction().begin();
        session.save(tempInstructor);
        session.getTransaction().commit();
    }
}
