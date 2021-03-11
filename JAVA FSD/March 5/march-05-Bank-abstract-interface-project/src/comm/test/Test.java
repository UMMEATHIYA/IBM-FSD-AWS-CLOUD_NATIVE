package comm.test;

import comm.example.Bank;
import comm.example.BankA;
import comm.example.BankB;
import comm.example.BankC;

public class Test {
    public static void main(String args[])
    {
        Bank ba = new BankA();
        ba.getBalance();
        Bank bb = new BankB();
        bb.getBalance();
        Bank bc = new BankC();
        bc.getBalance();
    }
}
