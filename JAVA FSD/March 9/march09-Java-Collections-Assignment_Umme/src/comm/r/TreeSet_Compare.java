package comm.r;

import java.util.TreeSet;

public class TreeSet_Compare {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("Blue");
        t1.add("Violet");
        t1.add("Red");
        t1.add("Pink");
        System.out.println("Elements of 1st TreeSet are:" + t1);

        TreeSet<String> t2 = new TreeSet<String>();
        t2.add("Blue");
        t2.add("Violet");
        t2.add("Red");
        t2.add("Pink");
        t2.add("Black");
        t2.add("White");
        System.out.println("Elements of 2nd TreeSet are:" + t2);

        //if(t1.equals(t2)){
          //  System.out.println("Equal");
        //}else{
        //    System.out.println("Not equal");
        //}
        for (String element : t1){
            System.out.println(t2.contains(element) ? "Yes" : "No");
        }
    }
}
