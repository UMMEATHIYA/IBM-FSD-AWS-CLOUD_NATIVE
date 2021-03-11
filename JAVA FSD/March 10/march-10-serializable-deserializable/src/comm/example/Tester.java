package comm.example;
import java.io.*;
import java.util.Random;
public class Tester {
    public static void main(String args[]) throws IOException
    {
        try {
            File file=new File("employee.md");
            FileOutputStream outputStream=new FileOutputStream(file);
            Employee employee=new Employee(new Random().nextInt(1000),"John","Doe","john@email.com");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(employee);
            System.out.println("employee object written");
            FileInputStream inputStream=new FileInputStream("employee.md");
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            Employee e=(Employee) objectInputStream.readObject();
            System.out.println(e);
        }
        catch (Exception e)
        {
        }
    }
}