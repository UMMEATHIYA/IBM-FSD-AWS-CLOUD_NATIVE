package comm.example;

public class Tester {

    public static void main(String args[])
    {
        //int a=10;
        //int b=10;
        Employee e1=new Employee("ram","sem","@joe.com",1223);
        Employee e2=new Employee("sam","fun","@doe.com",1223);
        System.out.println(e1.equals(e2));
    }
}