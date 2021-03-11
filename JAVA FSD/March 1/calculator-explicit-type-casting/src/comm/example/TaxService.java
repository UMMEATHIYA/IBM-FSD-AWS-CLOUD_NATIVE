package comm.example;
public class TaxService {
    private int tds=10;
    public void calcutaleTax(Employee employee)
    {
        if(employee instanceof Manager)
        {
            //explicit typecasting
            Manager manager=(Manager) employee;
            manager.getEmployeeDetails();
            System.out.println("No Tax");
        }
        if(employee instanceof Engineer)
        {
            Engineer engineer=(Engineer) employee;
            engineer.getEmployeeDetails();
            System.out.println("10% tax");
        }
    }
}