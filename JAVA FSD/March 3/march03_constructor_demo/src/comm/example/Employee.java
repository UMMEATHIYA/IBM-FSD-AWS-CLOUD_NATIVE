package comm.example;
import java.util.Date;

public class Employee extends Object {
    private String name;
    private double salary = 15000.00;
    private Date birthDate;

    public Employee(String n, Date DoB) {
        //implicit super();
        name=n;
        birthDate=DoB;
    }

    public Employee(String n)
    {
        this(n,null);
    }

    public String displayDetails()
    {
        return "name: "+name+ "Salary: " +salary+ "DOB" +birthDate;
    }


}
