public class Customer {
    //instance variables
    int customerId;
    String customerName;
    double customerAmount;

    //no args constructor
    //constructor overloading
    public Customer()
    {
        this(10);
    }
    public Customer(int customerId)
    {
        this(customerId,"John");
    }
    public Customer(int customerId,String customerName)
    {
        this(customerId,customerName,20000);
    }
    //three argument constructor
    public Customer(int customerId,String customerName,double customerAmount)
    {
        this.customerId=customerId;
        this.customerName=customerName;
        this.customerAmount=customerAmount;
    }
    public String getCustomerDetails()
    {
        return "ID: "+customerId+" Name: "+customerName+" Amount: "+customerAmount;
    }

}