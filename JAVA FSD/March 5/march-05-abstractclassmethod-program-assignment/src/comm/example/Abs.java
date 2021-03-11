package comm.example;

public abstract class Abs {
    public abstract String a_method();
    

    public Abs() {
        System.out.println("This is a constructor of Abstract class");
    }

    public void display()
    {
        System.out.println("This is first subclass");
    }
}
