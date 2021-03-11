package comm.l;

import java.util.HashSet;

public class HashSetRemove_Prog {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");
        System.out.println("Elements appended to the HashSet are:" +hashSet);
        System.out.println("************************************************************************");
        hashSet.clear();
        System.out.println("The Elements in the hashSet are cleared successfully");
        System.out.println(hashSet);
    }
}
