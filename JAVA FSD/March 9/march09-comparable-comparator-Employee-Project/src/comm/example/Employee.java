package comm.example;

public class Employee implements Comparable{
    private int empId;
    private String fName;
    private double salary;

    public Employee(int empId, String fName, double salary) {
        if((empId==0) ||(fName==null) ||(salary==0.0))
        {
            throw new NotAEmployeeException("Employee not found");
        }
        this.empId = empId;
        this.fName = fName;
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee emp=(Employee) o;
        double result = this.salary-emp.salary;
        if(result==0.0)
            return 0;
        else if (result<0.0)
        {
            return -1;
        }
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee ID=" + empId +
                ", Name='" + fName + '\'' +
                ", Salary=" + salary +
                '}';
    }

}
