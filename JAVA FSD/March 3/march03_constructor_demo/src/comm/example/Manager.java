package comm.example;

public class Manager extends Employee{
    private String department;

    public Manager(String n, String d) {
        super(n);
        department = d;
    }

    @Override
    public String displayDetails(){
        return super.displayDetails()+ "department: " +department;
    }
}
