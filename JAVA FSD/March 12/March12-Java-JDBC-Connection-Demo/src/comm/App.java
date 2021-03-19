package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import model.Employee;
import example.EmployeeService;
import example.EmployeeServiceImpl;
import exception.EmployeeNotFoundException;


public class App {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
			EmployeeService service = new EmployeeServiceImpl();
			int choice = 0;
			do {
				System.out.println("1. Create An Employee.");
				System.out.println("2. Display All Employees.");
				System.out.println("3. Remove a record");
				System.out.println("4. Search a record");
				System.out.println("5. Update a record");
				System.out.println("0.Exit.");
				System.out.print("Enter Your Choice. ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("ID: ");
					int id = scanner.nextInt();
					System.out.println("First Name: ");
					String fName = scanner.next();
					System.out.println("Last Name: ");
					String lName = scanner.next();
					System.out.println("Email: ");
					String email = scanner.next();
					System.out.println("Salary: ");
					int salary = scanner.nextInt();
					System.out.println("Bonus: ");
					int bonus = scanner.nextInt();
					Employee e1=service.createEmployee(new Employee(id, fName, lName, email, salary, bonus));
					System.out.println("employee sucessfully created: "+e1);
					break;

				case 2:
					EmployeeService employeeService = new EmployeeServiceImpl();
					try {
						List<Employee> employees = employeeService.getAllEmployees();
						if(employees.isEmpty())
						{
							System.err.println("\nempty table.");
						}
						for (Employee e : employees) {
							System.out.println(e);
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
						employeeService = new EmployeeServiceImpl();
						employeeService.removeEmployeeById(id);
						System.out.println("Record deleted successfully");
					} catch (SQLException e) {
						
						e.printStackTrace();
					} catch (EmployeeNotFoundException e) {
						System.err.println(e.getMessaage());
					}
					break;
				case 4: 
					System.out.println("Enter the ID to be searched:");
					id = scanner.nextInt();
					employeeService = new EmployeeServiceImpl();
					try {
					
						List<Employee> employees = employeeService.getAllEmployees();
						if(employees.isEmpty()) {
							System.err.println("\nempty table");
							
						}
						for(Employee e:employees) {
							if(e.getId()==(id)) {
								System.out.println(e.toString());
							}
						}
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
					break;
				case 5:
					System.out.println("Enter id to be updated");
					int id1 = scanner.nextInt();
					
						EmployeeService service1 = new EmployeeServiceImpl();
					try {
						service1.removeEmployeeById(id1);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (EmployeeNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
						System.out.println("First Name: ");
						String fName1 = scanner.next();
						System.out.println("Last Name: ");
						String lName1 = scanner.next();
						System.out.println("Email: ");
						String email1 = scanner.next();
						System.out.println("Salary: ");
						int salary1 = scanner.nextInt();
						System.out.println("Bonus: ");
						int bonus1 = scanner.nextInt();
						Employee e2=service1.createEmployee(new Employee(id1, fName1, lName1, email1, salary1, bonus1));
						System.out.println("employee is updated sucessfully: "+e2);
						System.out.println();
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

