public class CD {
    private int cdID;
    private String cdName;
    private int publishedYear;

    public CD(){

    }

    public CD(int cdID,String cdName, int publishedYear){
        this.cdID = cdID;
        this.cdName = cdName;
        this.publishedYear=publishedYear;
    }

    public String getDetails()
    {
        return "CD ID: " +cdID+ "CD Name: " +cdName+ "Year:" +publishedYear;
    }
}
