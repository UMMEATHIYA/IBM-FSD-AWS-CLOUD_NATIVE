package comm.example;

public class SubClass extends Abs {
    @Override
    public String a_method() {
        System.out.println("This is a normal method of Abstract class");
        return "";
    }

    @Override
    public void display() {
        super.display();
    }
}
