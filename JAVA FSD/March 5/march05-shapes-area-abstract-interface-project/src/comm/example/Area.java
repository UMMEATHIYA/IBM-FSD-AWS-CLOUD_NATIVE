package comm.example;

public class Area extends Shape{

    @Override
    public float RectangleArea(int length, int breath) {
        return length * breath;
    }

    @Override
    public float SquareArea(int side) {
        return side * side;
    }

    @Override
    public float CircleArea(int radius) {
        return (float) (3.14 * radius * radius);
    }

    @Override
    public void display() {
        super.display();
    }
}
