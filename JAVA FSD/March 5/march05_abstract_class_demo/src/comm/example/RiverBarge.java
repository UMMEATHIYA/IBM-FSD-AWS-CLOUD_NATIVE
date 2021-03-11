package comm.example;

public class RiverBarge extends Vehicle{
    @Override
    public double calculateFuelEfficiency() {
        System.out.println("Fuel");
        return 0;
    }

    @Override
    public double calculateTripDistance() {
        System.out.println("Trip");
        return 0;
    }

    @Override
    public void display() {
        super.display();
    }
}
