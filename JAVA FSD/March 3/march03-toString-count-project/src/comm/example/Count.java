package comm.example;

public class Count {
    private int serialNumber;
    public static int counter = 0;

    public Count(){
        counter++;
        serialNumber = counter;
        System.out.println(serialNumber);
    }

    public static void main(String args[])
    {
        Count c1=new Count();
        Count c2=new Count();
        Count c3=new Count();
    }
}
