package comm.b;

import java.util.HashSet;
import java.util.Iterator;

public class HashListIterationProg {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");
        System.out.println("Elements of HashSet are:" +hashSet);

        Iterator<String> itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
