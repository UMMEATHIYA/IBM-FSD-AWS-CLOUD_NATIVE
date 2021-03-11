package comm.example;

public class Motorcycle extends RoadVehicle{
    private String acceleratorType;

    public Motorcycle(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }
    @Override
    public void setVehicleDetails(int numPassengers,int numWheels,String make,String model) {
        super.setVehicleDetails(numPassengers,numWheels,make,model);
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("The Accelerator Type is: "+acceleratorType);
    }

    public void display()
    {
        System.out.println("hello");
    }
}
