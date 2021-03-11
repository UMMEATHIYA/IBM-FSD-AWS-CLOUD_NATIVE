package comm.g;

import java.util.HashSet;

public class HashSet_Array_Program {
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Good");
        hashSet.add("Morning");
        hashSet.add("Everyone");

        System.out.println("Elements of HashSet are:" + hashSet);
        String arr[] = new String[hashSet.size()];
        System.out.println("Size of hashSet is: " +hashSet.size());
        // toArray() method converts the set to array
        hashSet.toArray(arr);

        for (String n : arr)
            System.out.println(n);
        System.out.println("***************************************");
        System.out.println("Array element are specified locations is:" +arr[1]);
    }

}
