public class Customer {
    //instance variables
    int customerId;
    String customerName;
    double customerAmount;

    public String getDetails()
    {
        return "Customer ID: "+customerId+" Customer Name: "+customerName
                +" Customer Amount: "+customerAmount;
    }
    public void setDetails(int id,String name,double amount)
    {
        customerId=id;
        customerName=name;
        customerAmount=amount;
    }

    public void deposit(double amount)
    {
        customerAmount = customerAmount + amount;
        System.out.println("Current Balance is: " +customerAmount);
    }

    public String withdraw(double amount)
    {
        if(customerAmount<amount)
        {
            System.out.println("Insufficient Balance");
        }
        else {
            customerAmount = customerAmount - amount;
           // return "Your current balance is: " + customerAmount;
        }
        return "Your current balance is: " + customerAmount;
    }
}
