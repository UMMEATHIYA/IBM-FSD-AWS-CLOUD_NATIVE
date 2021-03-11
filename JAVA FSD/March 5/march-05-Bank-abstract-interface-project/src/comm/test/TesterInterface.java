package comm.test;

import comm.example.BankAInt;
import comm.example.BankBInt;
import comm.example.BankCInt;
import comm.example.BankInterface;

public class TesterInterface {
    public static void main(String args[])
    {
        BankInterface ba1=new BankAInt();
        ba1.getBalance();
        BankInterface ba2=new BankBInt();
        ba2.getBalance();
        BankInterface ba3=new BankCInt();
        ba3.getBalance();

    }
}
