package comm.t;

import java.util.TreeSet;

public class TreeSet_Addto_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("Blue");
        t1.add("Violet");
        t1.add("Red");
        t1.add("Pink");
        System.out.println("1st TreeSet elements are:" + t1);

        TreeSet<String> t2 = new TreeSet<String>();
        t2.add("DarkGreen");
        t2.add("Yellow");
        t2.add("Red");
        t2.add("Pink");
        t2.add("White");
        t2.add("Black");
        t2.add("Blue");
        System.out.println("2nd TreeSet elements are:" + t2);

        System.out.println("**********************************************************************************");
        System.out.println("The Elements from 2nd TreeSet are added to first TreeSet successfully");
        t1.addAll(t2);
        System.out.println();
        System.out.println("Note that duplicate entries are not allowed");
        System.out.println(t1);

    }
}
