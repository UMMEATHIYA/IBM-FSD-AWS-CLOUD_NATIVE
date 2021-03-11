package comm.example;

import java.io.*;

public class ReverseFileContents {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        //Creating a FileInputStream object
        FileInputStream inputStream = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];
        try {
            int numOfBytes = inputStream.read(bytes);
            System.out.println(numOfBytes);
            for (int i = 0; i < bytes.length; i++)
            {
                System.out.print((char) bytes[i]);
            }
            //printing the reverse contents of the file - test.txt
            System.out.println("***********************************");
            System.out.println();
            System.out.print("Reverse contents of the file are");
            for (int i = bytes.length - 1; i >= 0; i--) {
                System.out.print((char) bytes[i]);
            }

            System.out.println("\n"+"Data written successfully...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

