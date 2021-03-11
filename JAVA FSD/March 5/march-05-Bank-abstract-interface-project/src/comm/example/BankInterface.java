package comm.example;

public interface BankInterface {
    public double getBalance();

    public default void a()
    {
        System.out.println("Displaying Bank Balances Respectively");
    }
}
