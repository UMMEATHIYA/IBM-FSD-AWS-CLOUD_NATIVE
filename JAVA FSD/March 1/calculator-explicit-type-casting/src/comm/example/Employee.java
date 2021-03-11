package comm.example;

public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    //access specifier protected which is having access to same class/package/subclass
    public void setEmployeeDetails(String employeeId,String firstName,String lastName,String email)
    {
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    public void getEmployeeDetails()
    {
        System.out.printf("%s, %s, %s, %s",employeeId,firstName,lastName,email);
    }

}

