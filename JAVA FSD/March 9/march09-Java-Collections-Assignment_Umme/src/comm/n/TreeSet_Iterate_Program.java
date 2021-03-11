package comm.n;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Iterate_Program {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("Blue");
        t1.add("Violet");
        t1.add("Red");
        t1.add("Pink");
        Iterator<String> itr = t1.iterator();
        System.out.println("Elements displayed using iterator for TreeSet");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
