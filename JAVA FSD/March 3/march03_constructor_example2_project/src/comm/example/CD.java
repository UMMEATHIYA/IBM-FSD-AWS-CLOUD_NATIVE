package comm.example;

import java.util.Date;

public class CD extends Object{
    private int cdID;
    private String cdName;
    private String dateOfRelease;

    public CD(){

    }
    public void createNewCD(int cdID,String cdName,String dateOfRelease)
    {
        this.cdID=cdID;
        this.cdName=cdName;
        this.dateOfRelease=dateOfRelease;
    }
    public void displayCDDetails()
    {
        System.out.printf("%d,%s,%s",cdID,cdName,dateOfRelease);
    }


}
