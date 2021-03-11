package comm;

public class SubClass2 extends Parent{
    @Override
    public String Message() {
        System.out.println("This is second message");
        return null;
    }

    @Override
    public void display() {
        super.display();
    }
}
