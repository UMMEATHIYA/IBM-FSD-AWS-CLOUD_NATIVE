package comm.example;

public class SpecialEditionCD extends CD{
    private String specialityCD;

    public SpecialEditionCD(String specialityCD) {
        this.specialityCD = specialityCD;
    }
    public void createNewCD(int cdID,String cdName,String dateOfRelease) {
        super.createNewCD(cdID,cdName,dateOfRelease);
    }

    @Override
    public void displayCDDetails() {
        super.displayCDDetails();
        System.out.println("The speciality is: "+specialityCD);
    }

    public void display()
    {
        System.out.println("hello");
    }

}
