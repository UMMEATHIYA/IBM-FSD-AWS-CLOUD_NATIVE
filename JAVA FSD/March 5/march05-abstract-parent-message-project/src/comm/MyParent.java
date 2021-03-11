package comm;

public interface MyParent {
    public String Message();

    public default void a()
    {
        System.out.println("Displaying message");
    }
}
