public class Bank {
    //instance variables
    int bankId;
    String bankName;
    double bankCustomers;

    //no args constructor
    //constructor overloading
    public Bank()
    {
        this(10);
    }
    public Bank(int bankId)
    {
        this(bankId,"HDFC");
    }
    public Bank(int bankId,String bankName)
    {
        this(bankId,bankName,8892);
    }
    //three argument constructor
    public Bank(int bankId,String bankName,double customers)
    {
        this.bankId=bankId;
        this.bankName=bankName;
        this.bankCustomers=customers;
    }
    public String getBankDetails()
    {
        return "Bank ID: "+bankId+"| Bank Name: "+bankName+"| No. of Customers: "+bankCustomers;
    }

}