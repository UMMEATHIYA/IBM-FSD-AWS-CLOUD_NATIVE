package comm;

public class SubClass1 extends Parent{
    @Override
    public String Message() {
        System.out.println("This is first message");
        return "";
    }

    @Override
    public void display() {
        super.display();
    }
}
