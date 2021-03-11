package comm.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileWriter {

    public static void main(String[] args) {
        try {
            // Create a buffered reader to read each line from standard in.
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            // Create a print writer on this file.
            File f=new File("test.txt");
            PrintWriter out = new PrintWriter(f);
            String s;
            System.out.println("Enter the file text");
            System.out.println("Press ctrl + d to terminate");

            while ((s =in.readLine())!= null){
                out.println(s);
            }
            // Close the buffered reader and the file print writer.
            in.close();
            out.close();

        } catch (IOException e) {
            // Catch any IO exceptions.
            e.printStackTrace();
        }

    }

}
