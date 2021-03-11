package comm.test;


import comm.example.Truck;
import comm.example.Vehicle;

public class Tester1 {
    public static void main(String args[])
    {
        Truck t=new Truck(232);
        t.display();
        t.calculateFuelEfficiency();
        t.calculateTripDistance();

    }
}
