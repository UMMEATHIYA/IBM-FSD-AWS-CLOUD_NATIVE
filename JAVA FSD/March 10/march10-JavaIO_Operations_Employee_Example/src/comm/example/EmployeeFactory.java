package comm.example;

import java.io.*;
import java.util.Scanner;

public class EmployeeFactory {
    public static void main(String[] args) throws IOException {
        String empID;
        String fName;
        String lName;
        String email;
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID");
        empID = sc.next();
        System.out.println("Enter the first name");
        fName = sc.next();
        System.out.println("Enter the last name");
        lName = sc.next();
        System.out.println("Enter the email");
        email = sc.next();
        String text = "\n"+empID+"," +fName+ "," +lName+ "," +email;
        File f=new File("employee.txt");
        FileWriter fw=new FileWriter(f,true);
        fw.append(text);
        fw.flush();
        fw.close();
    }
}