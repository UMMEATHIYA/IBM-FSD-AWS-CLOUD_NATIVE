public class SpecialEditionCD extends CD{
    private String speciality;

    public SpecialEditionCD(){
        super();
    }

    public SpecialEditionCD(int cdID, String cdName, int publishedYear, String speciality)
    {
        super(cdID,cdName,publishedYear);
        this.speciality=speciality;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+"speciality:" +speciality;
    }
}
