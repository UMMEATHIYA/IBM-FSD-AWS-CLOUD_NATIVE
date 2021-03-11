package comm.example;

public class Manager extends Employee{
    private String departmentName;

    public Manager(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void setEmployeeDetails(String employeeId, String firstName, String lastName, String email) {
        super.setEmployeeDetails(employeeId, firstName, lastName, email);

    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Department Name Is: "+departmentName);
    }

    public void display()
    {
        System.out.println("hello");
    }
}

