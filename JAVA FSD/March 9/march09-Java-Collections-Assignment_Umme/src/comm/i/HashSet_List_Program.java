package comm.i;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet_List_Program {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        // use add() method to add values in the hash set
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");
        System.out.println("Elements of HashSet are: " +hashSet);

        // Create a List from HashSet elements
        List<String> list = new ArrayList<String>(hashSet);

        // Display ArrayList elements
        System.out.println("Elements in arraylist are: "+ list);
    }
}
