public class  Home{
    Customerdetails customerdetails[];
    public Home() {
        customerdetails=new Customerdetails[5];
    }
    public static void main(String args[])
    {
        Home home=new Home();
        for(int i=0;i<5;i++)
        {
            home.customerdetails[i]=new Customerdetails(i,"Naveen",39000);
            home.customerdetails[i]=new Customerdetails(i,"Nilay",39000);
            home.customerdetails[i]=new Customerdetails(i,"Nishanth",39000);
            home.customerdetails[i]=new Customerdetails(i,"Nisha",39000);
            home.customerdetails[i]=new Customerdetails(i,"Nandan",39000);
        }

        for (int i=0;i<5;i++)
        {
            System.out.println(home.customerdetails[i].getDetails());

        }
    }
}