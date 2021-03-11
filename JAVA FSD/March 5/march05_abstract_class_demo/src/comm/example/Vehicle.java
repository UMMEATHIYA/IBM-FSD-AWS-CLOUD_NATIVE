package comm.example;

public abstract class Vehicle {
    public abstract double calculateFuelEfficiency();
    public abstract double calculateTripDistance();

    public void display()
    {
        System.out.println("I Am Within Vehicle Class");
    }

}
