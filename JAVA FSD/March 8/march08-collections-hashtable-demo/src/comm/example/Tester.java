package comm.example;

import java.util.Hashtable;
import java.util.Map;

public class Tester {
    public static void main (String args[])
    {
        Map<Integer, Employee> map=new Hashtable<Integer,Employee>();
        Employee employee1=new Employee("10","aa","aa","aa");
        Employee employee2=new Employee("10","aa","aa","aa");
        map.put(1,employee1);
        map.put(2,employee2);
        System.out.println(map.get(1).hashCode());
        System.out.println(map.get(2).hashCode());
        System.out.println(map+"\n"+map.hashCode());


    }
}
