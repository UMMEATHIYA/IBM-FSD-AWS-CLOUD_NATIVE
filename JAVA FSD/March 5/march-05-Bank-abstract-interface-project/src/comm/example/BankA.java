package comm.example;

public class BankA extends Bank{
    private double balance = 100;
    @Override
    public double getBalance() {
        System.out.println("Balance of Bank A is: "+balance);
        return 0;
    }

    @Override
    public void display() {
        super.display();
    }
}
