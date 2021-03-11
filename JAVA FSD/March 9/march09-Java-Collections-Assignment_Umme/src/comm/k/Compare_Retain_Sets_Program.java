package comm.k;

import java.util.HashSet;

public class Compare_Retain_Sets_Program {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<String>();
        // use add() method to add values in the hash set
        hashSet1.add("Hello");
        hashSet1.add("Good");
        hashSet1.add("Morning");
        hashSet1.add("Everyone");
        System.out.println("Elements of 1st hashset:" + hashSet1);

        HashSet<String> hashSet2 = new HashSet<String>();
        // use add() method to add values in the hash set
        hashSet2.add("Hello");
        hashSet2.add("Good");
        hashSet2.add("Morning");
        hashSet2.add("Everyone");
        hashSet2.add("All");
        hashSet2.add("New");
        hashSet2.add("eve");
        System.out.println("Elements of 2nd hashset:" + hashSet2);

        if(hashSet1.equals(hashSet2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        System.out.println("*****************************************");
        System.out.println();
        hashSet1.retainAll(hashSet2);
        System.out.println("Retained Elements from both the hashSets are: " +hashSet1);
    }
}
