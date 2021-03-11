package comm.example;

public class Roadster extends Car{
    private String coolFactor;
    public Roadster(String coolFactor)
    {
        this.coolFactor=coolFactor;
    }

    @Override
    public void setVehicleDetails(int numPassengers,int numWheels,String make,String model) {
        super.setVehicleDetails(numPassengers,numWheels,make,model);
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("The cool factor is: "+coolFactor);
    }

    public void display()
    {
        System.out.println("hello");
    }
}
