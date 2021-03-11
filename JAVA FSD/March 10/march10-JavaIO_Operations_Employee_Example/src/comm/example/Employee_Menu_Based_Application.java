package comm.example;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee_Menu_Based_Application {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String empID = null;
        String fName = null;
        String lName = null;
        String email = null;
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean end = false;
        do {
            System.out.println("Employee Details Menu Based Application");
            System.out.println("Enter your choice:");
            System.out.println("1. Insert Employee Details");
            System.out.println("2. Display Employee Details");
            System.out.println("3. Copy(Save) Employee Details");
            System.out.println("4. Delete Employee Detail");
            System.out.println("5. Search Employee Detail");
            System.out.println("6. Exit ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter the Employee ID");
                    empID = sc.next();
                    System.out.println("Enter the first name");
                    fName = sc.next();
                    System.out.println("Enter the last name");
                    lName = sc.next();
                    System.out.println("Enter the email");
                    email = sc.next();
                    String text = "\n" + empID + "," + fName + "," + lName + "," + email;
                    File f = new File("employee.txt");
                    FileWriter fw = new FileWriter(f, true);
                    fw.append(text);
                    fw.flush();
                    fw.close();
                    break;
                case 2:
                    System.out.println("Displaying Employee Details");
                    File file = new File("employee.txt");
                    //Creating a FileInputStream object
                    FileInputStream inputStream = new FileInputStream(file);
                    //Creating a byte array
                    byte bytes[] = new byte[(int) file.length()];
                    System.out.println(bytes.length);
                    //Reading data into the byte array
                    try {
                        int numOfBytes = inputStream.read(bytes);
                        System.out.println(numOfBytes);
                        for (int i = 0; i < bytes.length; i++) {
                            System.out.print((char) bytes[i]);
                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Processing Text File");
                    File file1 = new File("employee.txt");
                    FileInputStream inputStream1 = new FileInputStream(file1);
                    byte bytes1[] = new byte[(int) file1.length()];
                    System.out.println(bytes1.length);
                    //Reading data into the byte array
                    try {
                        int numOfBytes = inputStream1.read(bytes1);
                        System.out.println(numOfBytes);
                        for (int i = 0; i < bytes1.length; i++) {
                            System.out.print((char) bytes1[i]);
                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println("Data copied successfully...");
                    FileOutputStream outputStream = new FileOutputStream("out.txt");
                    //Writing the contents of the Output Stream to a file
                    try {
                        outputStream.write(bytes1);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println("Data written successfully...");
                    break;
                case 4:




            }
        }while(!end);
        System.out.println("Bye!");
    }
}
