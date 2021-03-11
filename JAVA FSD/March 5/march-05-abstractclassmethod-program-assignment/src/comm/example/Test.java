package comm.example;

public class Test {
    public static void main(String[] args) {
        Abs abs = new SubClass();
        System.out.println(abs.a_method());
        System.out.println(abs);
    }
}
