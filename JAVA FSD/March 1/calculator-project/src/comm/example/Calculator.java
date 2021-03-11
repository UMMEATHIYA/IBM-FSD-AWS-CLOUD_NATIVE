package comm.example;
public class Calculator {
    /* private int firstNumber;
     private int secondNumber;
     public Calculator()
     {
     }
     public Calculator(int firstNumber,int secondNumber)
     {
         this.firstNumber=firstNumber;
         this.secondNumber=secondNumber;
     }
     public int sum()
     {
         return firstNumber+secondNumber;
     }
     public int sum(int firstNumber)
     {
         this.firstNumber=firstNumber;
         return this.firstNumber+secondNumber;
     }
     public int sum(int firstNumber,int secondNumber)
     {
         this.firstNumber=firstNumber;
         this.secondNumber=secondNumber;
         return this.firstNumber+this.secondNumber;
     }*/
    //method overloading
    public void add()
    {
        System.out.println("blank add");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(String a,String b)
    {
        System.out.println(a+b);
    }

}
