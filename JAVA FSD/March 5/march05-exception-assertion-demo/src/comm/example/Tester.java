package comm.example;

import java.util.UUID;
import java.util.Scanner;
public class Tester {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        int size=0;
        Person[] personList=null;
        System.out.print("Enter The Length of array: ");
        size = scanner.nextInt();
        personList = new Person[size];

        Tester t1=new Tester();
        for(int i=0;i<=personList.length;i++)
        {

            System.out.println("Enter first Name: ");
            String fname=scanner.next();
            System.out.println("Enter last Name: ");
            String lname=scanner.next();
            System.out.println("Enter email: ");
            String email=scanner.next();
            try{
                personList[i]=new Person(UUID.randomUUID().toString(),fname,lname,email);
                System.out.println(personList[i].displayDetails());
            }
            catch (ArrayIndexOutOfBoundsException aeobe)
            {
                System.out.println("Array Index Out of Bound");
                aeobe.printStackTrace();
            }
            finally {
                System.out.println("I am at finally");
            }


        }


    }
}
