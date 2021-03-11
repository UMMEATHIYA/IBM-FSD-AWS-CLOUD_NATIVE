package comm.demo;
import comm.example.*;
public class Tester extends Employee{
    public static void main(String args[])
    {
        Manager manager=new Manager("Sales");
        manager.setEmployeeDetails("e1","john","doe","j@email.com");
        Engineer engineer=new Engineer("SE");
        engineer.setEmployeeDetails("e2","Marry","Public","marry@email.com");
        TaxService taxService=new TaxService();
        //polymorphic argument
        taxService.calcutaleTax(manager);
        taxService.calcutaleTax(engineer);

    }
}

