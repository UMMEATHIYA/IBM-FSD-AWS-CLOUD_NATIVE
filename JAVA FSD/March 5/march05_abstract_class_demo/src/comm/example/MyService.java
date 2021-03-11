package comm.example;

public interface MyService {
    public static final int MAX=100;

    public void create();
    public void display();
    public void displayById();
    public default void a()
    {
        System.out.println("hello from interface");
    }
}
