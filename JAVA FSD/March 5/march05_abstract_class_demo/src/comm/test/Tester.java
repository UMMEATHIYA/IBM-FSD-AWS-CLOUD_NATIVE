package comm.test;

import comm.example.MyService;
import comm.example.MyServiceImple;

public class Tester {
    public static void main(String args[])
    {
        MyService myService=new MyServiceImple();
        myService.a();
        System.out.println(MyService.MAX);
    }
}
