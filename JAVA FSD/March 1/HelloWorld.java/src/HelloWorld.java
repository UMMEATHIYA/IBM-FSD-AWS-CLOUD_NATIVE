public class HelloWorld {
    public static void main(String args[])
    {
        //referance variable
        Bank bank=null;
        //new keyword is used to create object
        //called constructor
        bank=new Bank(122, "HDFC",32321);
        System.out.println(bank.getBankDetails());
    }
}
