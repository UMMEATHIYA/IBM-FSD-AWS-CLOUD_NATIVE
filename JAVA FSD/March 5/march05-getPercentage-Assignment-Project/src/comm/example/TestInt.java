package comm.example;

public class TestInt {
    public static void main(String[] args) {
        GetPerInterface g1 = new ClassAInt();
        g1.display();
        g1.getPercentage();
        GetPerInterface g2 = new ClassBInt();
        g2.getPercentage();
    }
}
