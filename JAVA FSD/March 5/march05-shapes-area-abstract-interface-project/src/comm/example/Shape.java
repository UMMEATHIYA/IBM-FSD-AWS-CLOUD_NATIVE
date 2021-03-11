package comm.example;

public abstract class Shape {
    public abstract float RectangleArea(int length, int breath);
    public abstract float SquareArea(int side);
    public abstract float CircleArea(int radius);

    public void display()
    {

        System.out.println("Area of different shapes");
    }

}
