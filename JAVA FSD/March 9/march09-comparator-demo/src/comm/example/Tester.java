package comm.example;

import java.util.Date;
import java.util.TreeSet;

public class Tester {
    public static void main(String arg[])
    {
        CompareDate comparator=new CompareDate();
        TreeSet<Tod> set=new TreeSet<Tod>(comparator);
        set.add(new Tod("id1","demo desc1",new Date("2021/03/12"),false));
        set.add(new Tod("id1","demo desc2",new Date("2021/03/10"),false));
        set.add(new Tod("id3","demo desc3",new Date("2021/02/12"),false));
        set.add(new Tod("id3","demo desc3",new Date("2021/01/12"),false));
        for(Tod t:set)
        {
            System.out.println(t);
        }
    }

    }

