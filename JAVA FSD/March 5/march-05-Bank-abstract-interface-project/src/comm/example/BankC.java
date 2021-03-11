package comm.example;

public class BankC extends Bank{
    private double balance = 200;
    @Override
    public double getBalance() {
        System.out.println("Balance of Bank C is: "+balance);
        return 0;
    }

    @Override
    public void display() {
        super.display();
    }
}
