package comm.example;

public class BankBInt implements BankInterface{
    public double balance = 150;
    @Override
    public double getBalance() {
        System.out.println("Balance of Bank B is: "+balance);
        return 0;
    }

    @Override
    public void a() {

    }
}
