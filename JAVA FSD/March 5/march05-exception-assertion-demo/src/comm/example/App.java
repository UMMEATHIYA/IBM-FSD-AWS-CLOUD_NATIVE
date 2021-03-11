package comm.example;

public class App {
    public static void main(String args[])
    {

        Calculator calculator=new Calculator(200,0);



        try
        {
            System.out.println(calculator.divide());
        }
        catch (ArithmeticException a)
        {
            System.out.println(a.toString());
        }
        catch (NumberFormatException ae)
        {
            ae.printStackTrace();
            System.out.println(ae.toString());
            System.err.println("can not devide by 0 check your code--->>>");
        }
        catch (ArrayIndexOutOfBoundsException re) {
            re.printStackTrace();
            System.out.println(re.toString());
            System.err.println("can not devide by 0 check your code");

        }

        try
        {

        }
        catch (Exception e)
        {

        }


    }
}
