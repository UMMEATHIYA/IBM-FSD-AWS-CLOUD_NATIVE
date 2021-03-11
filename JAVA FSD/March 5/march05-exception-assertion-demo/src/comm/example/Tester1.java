package comm.example;

public class Tester1 {
    public static void main(String args[])  {
        Employee employee=new Employee(1,"John11","Doe11");
        try
        {
            System.out.println(employee.getFullName());
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
