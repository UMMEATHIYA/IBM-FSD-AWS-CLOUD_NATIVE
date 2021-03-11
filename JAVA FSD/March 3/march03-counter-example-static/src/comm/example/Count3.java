package comm.example;
public class Count3 {
    private static int counter;

    //static block
    static
    {
        counter=10;
    }
    public static int getCounter()
    {
        return counter;
    }
    public static void main(String args[])
    {
        System.out.println(getCounter());
    }
}