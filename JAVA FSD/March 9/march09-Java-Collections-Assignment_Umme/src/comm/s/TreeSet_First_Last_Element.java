package comm.s;

import java.util.TreeSet;

public class TreeSet_First_Last_Element {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("Blue");
        t1.add("Violet");
        t1.add("Red");
        t1.add("Pink");
        System.out.println("TreeSet elements are:" + t1);
        String firstElement = t1.first();
        System.out.println("The first Element of treeSet is: " +firstElement);
        String lastElement = t1.last();
        System.out.println("The last Element of treeSet is: " +lastElement);
    }
}
