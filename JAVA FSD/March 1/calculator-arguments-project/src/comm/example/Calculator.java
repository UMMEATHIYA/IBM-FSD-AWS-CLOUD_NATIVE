package comm.example;
public class Calculator {
    public void add(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Result Is: " + sum);
    }
}