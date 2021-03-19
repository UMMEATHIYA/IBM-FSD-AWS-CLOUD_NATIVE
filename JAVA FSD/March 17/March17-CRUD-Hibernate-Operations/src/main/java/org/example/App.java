package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sun.security.krb5.Config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String csvFilePath = "C:\\Users\\ibmcloudn06\\Documents\\instructor.csv";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
            CSVParser records = CSVParser.parse(reader, CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
            SessionFactory sessionFactory;
            Session session;
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            for(CSVRecord record:records){
                Instructor instructor = new Instructor();
                instructor.setInstructorId(Integer.parseInt(record.get(0)));
                instructor.setName(record.get(1));
                instructor.setSubject(record.get(2));
                session.save(instructor);
                //session.getTransaction().commit();
            }
          //  session.getTransaction().commit();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
