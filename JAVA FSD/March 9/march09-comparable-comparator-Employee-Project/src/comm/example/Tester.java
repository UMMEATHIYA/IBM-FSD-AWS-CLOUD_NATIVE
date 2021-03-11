package comm.example;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
    public static void main(String[] args) {
        Employee emp=new Employee(new Random().nextInt(1000),"Umme",22000);
        Employee emp1=new Employee(new Random().nextInt(1000),"smitha",50002);
        Employee emp2=new Employee(new Random().nextInt(1000),"yashas",45908);
        Employee emp3=new Employee(new Random().nextInt(1000),"Joe",12000);
        Employee emp4=new Employee(new Random().nextInt(1000),"John",44444);
        Set<Employee> set=new TreeSet<Employee>();
        set.add(emp);
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        Object[] employees=set.toArray();
        for(Object o:employees)
        {
            Employee e=(Employee) o;
            System.out.println(e);
        }
    }
}
