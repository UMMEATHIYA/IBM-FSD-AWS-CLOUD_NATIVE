package comm.example;

public class Test {
    public static void main(String[] args) {
        Shape rect = new Area();
        System.out.println("Area of Rectangle is :"+ rect.RectangleArea(10,20));
        Shape square = new Area();
        System.out.println("Area of Square is: "+ square.SquareArea(4));
        Shape circle = new Area();
        System.out.println("Area of Circle is: "+ circle.CircleArea(5));
    }
}
