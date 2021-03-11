package comm.c;

import java.util.HashSet;

public class SizeOfHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");
        System.out.println("Elements of HashSet are:" +hashSet);
        System.out.println("Number of elements in HashSet are:" +hashSet.size());
    }
}
