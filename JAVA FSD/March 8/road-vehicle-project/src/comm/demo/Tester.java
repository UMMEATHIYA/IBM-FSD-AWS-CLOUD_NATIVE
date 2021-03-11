package comm.demo;
import comm.example.Roadster;
import comm.example.RoadVehicle;
import comm.example.Motorcycle;
import comm.example.Car;
import comm.example.Coupe;


public class Tester{
    public static void main(String args[])
    {
        RoadVehicle roadVehicles[]=new RoadVehicle[5];
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.setVehicleDetails(234,3,"Robert","BOSCH");
        Motorcycle motorcycle1=new Motorcycle("Automatic");
        motorcycle1.setVehicleDetails(234,3,"Robert","BOSCH");
        Car car2=new Car("Manual");
        car2.setVehicleDetails(234,3,"Robert","BOSCH");
        Coupe coupe3 = new Coupe("GFS");
        coupe3.setVehicleDetails(234,3,"Robert","BOSCH");
        Roadster roadster4 = new Roadster("CWE");
        roadster4.setVehicleDetails(234,3,"Robert","BOSCH");

        //heterogeneous collections
        roadVehicles[0]=roadVehicle;
        roadVehicles[1]=motorcycle1;
        roadVehicles[2]=car2;
        roadVehicles[3]=coupe3;
        roadVehicles[4]=roadster4;
        for(int i=0;i<roadVehicles.length;i++)
        {
            roadVehicles[i].getVehicleDetails();
        }
    }
}
