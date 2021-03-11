package comm.example;

public class Employee {
    private String empID;
    private String fName;
    private String lName;
    private String email;

    public Employee(String empID, String fName, String lName, String email) {
        this.empID = empID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public Employee() {

    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
