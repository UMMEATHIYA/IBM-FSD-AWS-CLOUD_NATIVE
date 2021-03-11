package comm.example;

public class BankB extends Bank{
    private double balance = 150;
    @Override
    public double getBalance() {
        System.out.println("Balance of Bank B is: "+balance);
        return 0;
    }

    @Override
    public void display() {
        super.display();
    }
}
