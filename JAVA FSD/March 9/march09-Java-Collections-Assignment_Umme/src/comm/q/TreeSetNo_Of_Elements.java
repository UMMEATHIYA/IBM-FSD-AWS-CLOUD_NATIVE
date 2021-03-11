package comm.q;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetNo_Of_Elements {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("Blue");
        t1.add("Violet");
        t1.add("Red");
        t1.add("Pink");
        System.out.println("TreeSet elements are:" + t1);
        System.out.println("The size of TreeSet Elements are:" +t1.size());

    }
}
