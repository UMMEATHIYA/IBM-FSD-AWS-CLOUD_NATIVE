package org.example;

/**
 * Hello world!
 *
 */
import org.example.entity.Customer;
import org.example.exception.CustomerNotFoundException;
import org.example.service.CustomerService;
import org.example.service.CustomerServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.example.service.CustomerServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static CustomerService customerService;

    static {
        customerService = new CustomerServiceImpl();
    }

    public static void main(String[] args) {
        int choice=0;
        do{
            System.out.println("1.Create");
            System.out.println("2.Display");
            System.out.println("3. Find customer by ID");
            System.out.println("4. Find Customer by Name");
            System.out.println("5. Update a customer record");
            System.out.println("6. Delete a customer record");
            System.out.println("0.Exit");
            System.out.print("Enter Your Choice: ");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    System.out.print("NAME: ");
                    String name = scanner.next();
                    customerService.createCustomer(new Customer(id,name));
                    System.out.print("customer created.");
                    break;
                case 2:
                    List<Customer> list=customerService.getAllCustomer();
                    Iterator<Customer> iterator=list.listIterator();
                    while(iterator.hasNext())
                    {
                        System.out.println(iterator.next());
                    }
                    break;
                case 3:
                    System.out.println("Enter the customer ID to be searched");
                    id = scanner.nextInt();
                    Customer customer = customerService.getCustomerById(id);
                    if(customer==null){
                        throw new CustomerNotFoundException("No customer with the searched id"+id);
                    }
                    System.out.println(customer);

                    break;
                case 4:
                    System.out.println("Enter the customer name to be searched");
                    Scanner sc = new Scanner(System.in);
                    name = sc.next();
                    List<Customer> customers = (List<Customer>) customerService.getCustomerByName(name);

                    System.out.println(customers);
                    break;
                case 5:
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    Customer customer1=customerService.updateCustomer(id);
                    System.out.println("updation done.\n"+customer1);
                    break;


                case 6:
                    System.out.println("Enter the ID to be deleted");
                    id = scanner.nextInt();
                    Customer customer2 = customerService.deleteCustomer(id);
                    customerService.deleteCustomer(id);
                    if(customer2==null){
                        throw new CustomerNotFoundException("No customer with the searched id"+id);
                    }
                    System.out.println("Customer Record Deleted Successfully"+id);

                    break;
                default:
                    System.out.println("invalid choice.");
                    break;

            }

        }while(choice!=0);


    }

}