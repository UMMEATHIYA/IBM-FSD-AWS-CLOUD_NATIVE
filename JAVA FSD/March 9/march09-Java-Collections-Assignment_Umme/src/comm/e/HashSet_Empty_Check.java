package comm.e;

import java.util.HashSet;

public class HashSet_Empty_Check {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");
        System.out.println("Elements appended to the HashSet are:" +hashSet);
        //check if hashset is empty of not
        System.out.println(hashSet.isEmpty());
        System.out.println("**************************************************");
        System.out.println();
        hashSet.clear();
        System.out.println("After deleting :-");
        System.out.println("The Elements in the hashSet are cleared successfully");
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
    }
}
