package comm.a;

import java.util.HashSet;

public class HashSetAppendProg {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");
        System.out.println("Elements appended to the HashSet are:" +hashSet);
    }
}
