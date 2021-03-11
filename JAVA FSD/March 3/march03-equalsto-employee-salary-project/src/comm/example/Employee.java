package comm.example;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private int salary;

    public Employee(){
        //default constructor
    }

    public Employee(String firstName, String lastName,String email, int salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    //

    public String getEmail(){
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }
    //

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    @Override
    public boolean equals(Object o)
    {
        Employee e=null;
        if(o instanceof Employee)
        {
            e = (Employee) o;
        }

        if(this.getSalary()==e.getSalary())
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
