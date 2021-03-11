package comm.example;

public class CounterTest {
    public static void main(String args[])
    {
        System.out.println("Number of counter is" +Counter2.getTotalCount());
        CounterTest counter = new CounterTest();
        System.out.println("Number of counter is " +Counter2.getTotalCount());
    }
}
