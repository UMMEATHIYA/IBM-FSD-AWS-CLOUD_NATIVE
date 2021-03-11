package comm.example;
import java.io.Serializable;
public class Employee implements Serializable {
    private int id;
    private String fName;
    private String lName;
    private transient String email;
    public Employee() {
    }
    public Employee(int id, String fName, String lName, String email) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}