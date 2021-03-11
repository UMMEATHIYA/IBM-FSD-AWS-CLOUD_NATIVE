package comm.example;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
    public static void main(String args[])
    {
        Student student=new Student(new Random().nextInt(1000),"John",2.3);
        Student student1=new Student(new Random().nextInt(1000),"John1",5.2);
        Student student2=new Student(new Random().nextInt(1000),"John2",3.3);
        Student student3=new Student(new Random().nextInt(1000),"John3",2.1);
        Student student4=new Student(new Random().nextInt(1000),"John4",8.3);
        Set<Student> set=new TreeSet<Student>();
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student4);
        set.add(student3);
        Object[] students=set.toArray();
        for(Object o:students)
        {
            Student s=(Student) o;
            System.out.println(s);
        }

    }
}
