package comm.f;

import java.util.HashSet;

public class HashSetClone {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");
        //System.out.println("Elements of HashSet are:" + hashSet);
        HashSet<String> hashSetCop = new HashSet<>(hashSet);


        System.out.println("Elements of 1st hashSet are:" + hashSet);

        // Print Copy HashSet
        System.out.println("Elements of 2nd hashset copied from 1st hashset are: " + hashSetCop);
    }
}
