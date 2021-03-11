package comm.example;

public class Coupe extends Car{
    private String boringFactor;

    public Coupe(String boringFactor)
    {
        this.boringFactor=boringFactor;
    }

    @Override
    public void setVehicleDetails(int numPassengers,int numWheels,String make,String model) {
        super.setVehicleDetails(numPassengers,numWheels,make,model);
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("The boring factor is: "+boringFactor);
    }

    public void display()
    {
        System.out.println("hello");
    }
}
