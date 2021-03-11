package comm.example;

public class BankCInt implements BankInterface{
    public double balance = 200;
    @Override
    public double getBalance() {
        System.out.println("Balance of Bank C is: "+balance);
        return 0;
    }

    @Override
    public void a() {

    }
}
