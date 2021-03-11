package comm.o;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_reverse {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("Blue");
        t1.add("Violet");
        t1.add("Red");
        t1.add("Pink");

        Set<String> reverseSet = t1.descendingSet();

        //get an iterator
        Iterator<String> itr = reverseSet.iterator();

        System.out.println("Reverse set contains: ");
        while(itr.hasNext()){
            System.out.println( itr.next() );
        }
    }
}
