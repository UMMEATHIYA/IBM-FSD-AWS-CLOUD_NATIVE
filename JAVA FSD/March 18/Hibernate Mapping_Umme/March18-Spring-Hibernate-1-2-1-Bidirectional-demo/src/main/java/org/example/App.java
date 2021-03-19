package org.example;

/**
 * Hello world!
 *
 */

import org.example.entity.Instructor;
import org.example.entity.InstructorDetail;
import org.example.exception.InstuctorNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App
{

    //private  CustomerService customerService;
    private static Scanner scanner = new Scanner(System.in);





    public static void main(String[] args )
    {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session=factory.openSession();
        Scanner sc = new Scanner(System.in);
        String fName, lName,email,hobby,youtubeChannel;
        int choice=0;
        do{
            System.out.println("1. Insert an Instructor Record");
            System.out.println("2. Get Instructor Detail by ID");
            System.out.println("3. Delete instructor by ID");
            System.out.println("4. Displaying all the records");
            System.out.println("0.Exit");
            System.out.print("Enter Your Choice: ");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the instructor details");
                    System.out.println("First Name");
                    fName = sc.next();
                    System.out.println("Last Name");
                    lName = sc.next();
                    System.out.println("Email:");
                    email = sc.next();
                    System.out.println("Youtube Channel:");
                    youtubeChannel = sc.next();
                    System.out.println("Hobby:");
                    hobby = sc.next();
                    //SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
                    //Session session=factory.openSession();
                    Instructor tempInstructor = new Instructor(fName,lName,email);
                    InstructorDetail tempInstructorDetail = new InstructorDetail(youtubeChannel,hobby);
                    tempInstructor.setInstructorDetail(tempInstructorDetail);
                    session.getTransaction().begin();
                    session.save(tempInstructor);
                    System.out.println(tempInstructor);
                    session.getTransaction().commit();
                    break;

                case 2:
                    try {
                        session.beginTransaction();

                        // get the instructor detail object
                        System.out.println("Enter the instructor ID:");
                        int theId = sc.nextInt();
                        InstructorDetail tempInstructorDetail1 =
                                session.get(InstructorDetail.class, theId);

                        // print the instructor detail
                        System.out.println("tempInstructorDetail: " + tempInstructorDetail1);

                        // print  the associated instructor
                        System.out.println("the associated instructor: " +
                                tempInstructorDetail1.getInstructor());

                        // commit transaction
                        session.getTransaction().commit();

                        System.out.println("Done!");
                    }
                    catch (Exception exc) {
                        exc.printStackTrace();
                    }
                    finally {
                        // handle connection leak issue
                        session.close();

                        factory.close();
                    }
                    break;
                case 3:
                    try {

                        // start a transaction
                        session.beginTransaction();

                        // get instructor by primary key / id
                        int theId1 = sc.nextInt();
                        Instructor tempInstructor2 =
                                session.get(Instructor.class, theId1);

                        System.out.println("Found instructor: " + tempInstructor2);

                        // delete the instructors
                        if (tempInstructor2 != null) {

                            System.out.println("Deleting: " + tempInstructor2);

                            // Note: will ALSO delete associated "details" object
                            // because of CascadeType.ALL
                            //
                            session.delete(tempInstructor2);
                        }

                        // commit transaction
                        session.getTransaction().commit();

                        System.out.println("Done!");
                    }
                    finally {
                        factory.close();
                    }
                    break;
                case 4:
                    System.out.println("Displaying all the records");
                    Transaction t = session.beginTransaction();
                    List<Instructor> allUsers = new ArrayList<Instructor>();
                    allUsers = (List<Instructor>)session.createQuery("from Instructor").list();
                    t.commit();
                    //closeSession();
                    System.out.println(allUsers);
                    //System.out.println(tempInstructor);
                    break;

                default:
                    System.out.println("invalid choice.");
                    break;

            }

        }while(choice!=0);
        System.out.println("Bye...!");


    }

}
