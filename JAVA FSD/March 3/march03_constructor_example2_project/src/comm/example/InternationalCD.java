package comm.example;

public class InternationalCD extends CD{
    private String language;

    public InternationalCD(String langauage) {
        this.language = langauage;
    }
    public void createNewCD(int cdID,String cdName,String dateOfRelease) {
        super.createNewCD(cdID,cdName,dateOfRelease);
    }

    @Override
    public void displayCDDetails() {
        super.displayCDDetails();
        System.out.println("The language is: "+language);
    }
}
