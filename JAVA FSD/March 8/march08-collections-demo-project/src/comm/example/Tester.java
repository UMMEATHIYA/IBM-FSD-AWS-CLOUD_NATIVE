package comm.example;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

    Collection<Integer> collection = new HashSet<Integer>();
        collection.add(10);
        collection.add(20);
        collection.add(10);
    List<Integer> list = new ArrayList<Integer>(collection);
        System.out.println(list);
    //list.add(new Employee());
    // list.add(new Employee());
    List<Employee> list1 = new ArrayList<Employee>();
        list1.add(new

    Employee("1","a","b","c"));
        list1.add(new Employee("2","e","f","g"));
    Iterator<Employee> iterator = list1.iterator();
        while(iterator.hasNext())

    {
        System.out.println(iterator.next());
    }
}
}
