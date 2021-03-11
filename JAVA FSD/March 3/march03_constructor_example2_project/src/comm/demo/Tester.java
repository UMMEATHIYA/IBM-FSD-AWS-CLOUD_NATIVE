package comm.demo;
import comm.example.CD;
import comm.example.SpecialEditionCD;
import comm.example.InternationalCD;

public class Tester {
    public static void main(String args[])
    {
        CD cds[]=new CD[3];
        CD cd=new CD();
        cd.createNewCD(12,"Max","2018");
        SpecialEditionCD sp=new SpecialEditionCD("National");
        sp.createNewCD(12,"Max","2018");
        InternationalCD intd=new InternationalCD("Hindi");
        intd.createNewCD(12,"Max","2018");

        cds[0]=cd;
        cds[1]=sp;
        cds[2]=intd;

        for(int i=0;i<cds.length;i++)
        {
            cds[i].displayCDDetails();
        }
    }
}
