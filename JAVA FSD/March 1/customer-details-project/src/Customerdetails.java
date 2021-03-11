public class Customerdetails {
    int customerId;
    String customerName;
    double customerAmount;
    public Customerdetails() {
    }
    public Customerdetails(int customerId, String customerName, double customerAmount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAmount = customerAmount;
    }
    public String getDetails()
    {
        return "Customer id: "+customerId+" Customer Name: "+customerName+" Customer Amount "+customerAmount;
    }
}
