package org.example.spring_jdbc;

import java.sql.SQLException;
import java.util.List;
/**
 * Hello world!
 *
 */
import java.util.Scanner;


import org.example.spring_jdbc.model.Student;
import org.example.spring_jdbc.service.StudentService;
import org.example.spring_jdbc.service.StudentServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;




/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args ) throws Exception
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	StudentService service=context.getBean("studentService",StudentServiceImpl.class);
       int choice;
       do {
    	    System.out.println("1. Insert a student record.");
			System.out.println("2. Display All student records.");
			System.out.println("3. Remove a record");
			System.out.println("4. Search a record");
			System.out.println("5. Update a record");
			System.out.println("0.Exit.");
			System.out.print("Enter Your Choice. ");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				   System.out.print("ID: ");
		    	   int id=scanner.nextInt();
		    	   System.out.println("First Name: ");
		    	   String fName1=scanner.next();
		    	   System.out.println("last Name: ");
		    	   String lName=scanner.next();
		    	   System.out.println("Email: ");
		    	   String email=scanner.next();
		    	   Student student;
				try {
					student = service.createStudent(new Student(id, fName1, lName, email));
					System.out.println("Student Created Sucessfully..."+student);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    	  // System.out.println("Student Created Sucessfully..."+student);
		    	   break;
		    	   
			case 2:
				try {
					List<Student> students = service.getAllStudents();
					if(students.isEmpty())
					{
						System.err.println("\nempty table.");
					}
					for (Student s : students) {
						System.out.println(s);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.print("ID: ");
				id = scanner.nextInt();
				try {
					service.removeStudentById(id);
					System.out.println("Record deleted successfully");
				} catch (SQLException e) {
					
					e.printStackTrace();
				} catch (Exception e) {
					System.err.println("No record found.. failed");
				}
				break;
				
			case 4: 
				//StudentService studentService21 = new StudentServiceImpl();
				System.out.println("Enter the ID to be searched:");
				id = scanner.nextInt();
				try {
				
					List<Student> students = service.getAllStudents();
					if(students.isEmpty()) {
						System.err.println("\nempty table");
						
					}
					for(Student s:students) {
						if(s.getId()==(id)) {
							System.out.println(s.toString());
						}
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				break;
				
			case 5:
				System.out.println("Enter id to be updated");
				int id1 = scanner.nextInt();
				
					//StudentService service12 = new StudentServiceImpl();
				try {
					service.removeStudentById(id1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
					System.out.println("First Name: ");
					String fName2 = scanner.next();
					System.out.println("Last Name: ");
					String lName2 = scanner.next();
					System.out.println("Email: ");
					String email2 = scanner.next();
					
				Student s2;
				
					s2 = service.createStudent(new Student(id1, fName2, lName2, email2));
					System.out.println("employee is updated sucessfully: "+s2);
					System.out.println();
				
					// TODO Auto-generated catch block
			
					break;
			case 0:
				System.out.println("Bye....!");
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
				break;
			}
			
			
			
			
			
			
			
			
			
			
       } while (choice != 0);
       System.out.println("Bye....!");
    }
}