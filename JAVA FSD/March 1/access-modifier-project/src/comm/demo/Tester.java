import comm.example.Employee;
import comm.example.Engineer;
import comm.example.Manager;

public class Tester{

    public static void main(String args[])
    {
        Employee employees[]=new Employee[3];
        Employee employee=new Employee();
        employee.setEmployeeDetails("emp2","Marry","public","marry@email.com");
        Manager manager1=new Manager("Sales");
        manager1.setEmployeeDetails("emp1","john","doe","john@email.com");
        Engineer engineer2=new Engineer("SE");
        engineer2.setEmployeeDetails("emp5","Ram","Mohan","ram@email.com");
        //heterogeneous collections
        employees[0]=employee;
        employees[1]=manager1;
        employees[2]=engineer2;
        for(int i=0;i<employees.length;i++)
        {
            employees[i].getEmployeeDetails();
        }
    }
}
