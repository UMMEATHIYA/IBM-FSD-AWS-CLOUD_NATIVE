package comm.example;

public class Car extends RoadVehicle{
    private String acceleratorType;

    public Car(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    public Car()
    {

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
