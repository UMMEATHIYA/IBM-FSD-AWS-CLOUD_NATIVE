package comm.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String args[])throws FileNotFoundException {
        //Creating a File object
        File file = new File("foo.txt");
        //Creating a FileInputStream object
        FileInputStream inputStream = new FileInputStream(file);
        //Creating a byte array
        byte bytes[] = new byte[(int) file.length()];
        System.out.println(bytes.length);
        //Reading data into the byte array
        try {
            int numOfBytes = inputStream.read(bytes);
            System.out.println(numOfBytes);
            for (int i = 0; i < bytes.length; i++)
            {
                System.out.print((char) bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
