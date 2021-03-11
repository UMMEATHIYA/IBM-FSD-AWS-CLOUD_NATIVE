package comm.demo;
import comm.example.Calculator;
public class Tester extends Calculator{
    public static void main(String args[])
    {
        Calculator c=new Calculator();
        c.add();
        c.add(10,20);
        c.add("Hello","World");

    }
}