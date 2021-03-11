package comm.example;

public class Counter2 {
    private int serialNumber;
    private static int counter =0;

    public static int getTotalCount() {
        return counter;
    }

    public Counter2() {
        counter++;
        serialNumber=counter;
    }
}

