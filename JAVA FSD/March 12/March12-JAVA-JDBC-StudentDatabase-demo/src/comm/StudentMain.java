package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import example.StudentService;
import example.StudentServiceImpl;
import model.Student;

public class StudentMain {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
			StudentService service = new StudentServiceImpl();
			int choice = 0;
			do {
				System.out.println("1.Insert values into student database.");
				System.out.println("2.Display the student details.");
				System.out.println("0.Exit.");
				System.out.print("Enter Your Choice. ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Student ID: ");
					int id = scanner.nextInt();
					System.out.println("First Name: ");
					String fName = scanner.next();
					System.out.println("Last Name: ");
					String lName = scanner.next();
					System.out.println("Class: ");
					int cls = scanner.nextInt();
					System.out.println("GPA: ");
					float GPA = scanner.nextFloat();
					Student s1=service.createStudent(new Student(id, fName, lName, cls, GPA));
					System.out.println("Student record inserted successfully: "+s1);
					break;

				case 2:
					StudentService studentService = new StudentServiceImpl();
					try {
						List<Student> students = studentService.getAllStudents();
						for (Student s : students) {
							System.out.println(s);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 0:
					System.out.println("Bye....!");
					System.exit(0);

				default:
					System.out.println("Invalid Choice");
					break;
				}

			} while (choice != 0);

		}
}
