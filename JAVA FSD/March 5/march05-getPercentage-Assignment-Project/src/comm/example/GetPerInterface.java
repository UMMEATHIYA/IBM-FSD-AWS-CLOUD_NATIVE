package comm.example;

public interface GetPerInterface {
    public  float getPercentage();


    public default void display()
    {
        System.out.println("Displaying percentage of Student A and B");
    }
}
