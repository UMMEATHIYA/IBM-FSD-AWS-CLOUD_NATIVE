package comm.example;

public class Tester {
    public static void main(String args[])
    {
        int id=Integer.parseInt(args[0]);
        String name=args[1];
        double balance=Double.parseDouble(args[2]);
        Account account=new Account(id,name,balance);
        System.out.println(account.displayDetails());
    }
}
