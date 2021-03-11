package comm.example;

public class RoadVehicle {
    private int numPassengers;
    private int numWheels;
    private String make;
    private String model;

    public void setVehicleDetails(int numPassengers,int numWheels,String make,String model)
    {
        this.numPassengers=numPassengers;
        this.numWheels=numWheels;
        this.make=make;
        this.model=model;
    }

    public void getVehicleDetails()
    {
        System.out.printf("%d,%d,%s,%s",numPassengers,numWheels,make,model);
    }
}
