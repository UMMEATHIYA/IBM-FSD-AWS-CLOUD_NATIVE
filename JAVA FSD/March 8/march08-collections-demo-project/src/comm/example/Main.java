package comm.example;

import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean end = false;
        String employeeId;
        String firstName = null;
        String lastName = null;
        String email = null;
        List<Employee> l1 = new LinkedList<Employee>();
        do{
            System.out.println("Employee Details Application");
            System.out.println("1.Insert Employee Details");
            System.out.println("2. Display Employee Details");
            System.out.println("3. Delete Employee Details");
            System.out.println("4. Update Employeee Details");
            System.out.println("5. Exit..!");
            choice = sc.nextInt();
            employeeId = UUID.randomUUID().toString();
            switch(choice){
                case 1:
                    System.out.println("Enter Employee First Name");
                    firstName = sc.next();
                    System.out.println("Enter Employee last Name");
                    lastName = sc.next();
                    System.out.println("Enter Employee email");
                    email = sc.next();
                    Employee emp = new Employee(employeeId,firstName,lastName,email);
                    l1.add(emp);
                    break;

                case 2:
                    //1System.out.println("Employee ID:" + UUID.randomUUID().toString()+ "|| First Name:"+firstName+ "|| Last Name:" +lastName+ "||Email:" + email);
                    Iterator<Employee> iterator = l1.iterator();
                    while(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case 3:
                    System.out.println("Enter the Employee ID to be deleted:");
                    employeeId = sc.next();
                    Iterator<Employee> iterator1=l1.iterator();
                    System.out.println(l1.size());
                    while (iterator1.hasNext())
                    {

                        Employee e=iterator1.next();
                        if (e.getEmployeeID().equals(employeeId))
                        {
                            System.out.println(true);
                            //Employee e=iterator.next();
                            l1.remove(e);
                            System.out.println(l1.size());
                        }
                    }
                    System.out.println(l1);
                    break;
                case 4:
                    System.out.println("Enter ID to be modified:");
                    employeeId = sc.next();
                    System.out.println("Enter First Name");
                    firstName = sc.next();
                    System.out.println("Enter Last Name");
                    lastName = sc.next();
                    System.out.println("Enter email");
                    email = sc.next();
                    Employee e1 = new Employee(employeeId,firstName,lastName,email);
                    l1.add(e1);
                    Iterator<Employee> iterator2=l1.iterator();
                    System.out.println(l1.size());
                    while (iterator2.hasNext())
                    {

                        Employee e=iterator2.next();
                        if (e.getEmployeeID().equals(employeeId))
                        {
                            System.out.println(true);
                            //Employee e=iterator.next();
                            l1.remove(e);
                            System.out.println(l1.size());
                        }
                    }
                    System.out.println(l1);
                    break;

                default:
                    System.out.println("Invlaid Choice");
            }
        }while(!end);
        System.out.println("Thank you");

    }
}
