package comm.p;

import java.util.TreeSet;

public class TreeSet_Clone {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("Blue");
        t1.add("Violet");
        t1.add("Red");
        t1.add("Pink");
        System.out.println("TreeSet elements are:" + t1);
        System.out.println("************************************************");
        TreeSet clone_treeSet = new TreeSet();
        clone_treeSet = (TreeSet)t1.clone();
        System.out.println("Cloned TreeSet Elements are:" + clone_treeSet);

    }
}