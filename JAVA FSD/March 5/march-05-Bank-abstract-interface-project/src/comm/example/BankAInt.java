package comm.example;

public class BankAInt implements BankInterface{
    private double balance = 100;

    @Override
    public double getBalance() {
        System.out.println("Balance of Bank A is: " +balance);
        return 0;
    }

    @Override
    public void a() {
    }
}
