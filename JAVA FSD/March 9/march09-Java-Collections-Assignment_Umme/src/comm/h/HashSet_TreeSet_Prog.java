package comm.h;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_TreeSet_Prog {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");

        System.out.println("Elements of HashSet are:" + hashSet);

        Set<String> treeset = new TreeSet<>(hashSet);
        System.out.println("Elements of TreeSet are:" +treeset);


    }
}
