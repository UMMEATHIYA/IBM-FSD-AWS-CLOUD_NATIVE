package comm.example;
import java.util.Random;

public class Bank {
    //blank final variable
    //now its not blank final variable because we have assigned some value
    private final double RATE_OF_INTEREST = 3.2;
    //private final double RATE_OF_INTEREST;
    private int customerId;
    private double amounttemp=0;
    private double totalAmount=20000;
    private double principal=1500;
    private int time=2;
    private double interest;

    public double getTotalAmount(){
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount)
    {
        this.totalAmount=totalAmount;
    }

    public Bank()
    {
        customerId=createCustomerId();
    }

    private int createCustomerId() {
        return new Random().nextInt(1000);
    }

    @Override
    public String toString(){
        return "Customer ID is:" +customerId+ "   Interest Rate is:" +RATE_OF_INTEREST;
    }

    public double calculateTotalInterest()
    {
        interest = (principal*RATE_OF_INTEREST*time)/100;
        return interest;
    }

    public double calculateTotalAmountWithInterest()
    {
        amounttemp = principal + interest;
        totalAmount = totalAmount + amounttemp;
        return totalAmount;
    }


    public static void main(String args[])
    {
        Bank bank = new Bank();
        System.out.println(bank);
        System.out.println("Original Amount:" + bank.totalAmount);
        System.out.println("Interest is :"+bank.calculateTotalInterest());
        System.out.println("Total Amount with Interest is: "+bank.calculateTotalAmountWithInterest());
    }

}
