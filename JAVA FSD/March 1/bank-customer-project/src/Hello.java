public class Hello {
    public static void main(String args[])
    {
        //referance variable
        Customer customer=null;
        //new keyword is used to create object
        //called constructor
        customer=new Customer(1,"John",10000);
        System.out.println(customer.getCustomerDetails());
    }
}