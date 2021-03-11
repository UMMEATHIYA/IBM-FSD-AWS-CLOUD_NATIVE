package comm.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {

    public static void main(String[] args) {
        try {
            // Create a buffered reader to read each line from standard in.
            String line;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text");
            line = sc.nextLine();
            String text = "\n"+ line;
            File f=new File("foo.txt");
            java.io.FileWriter fw=new FileWriter(f,true);
            fw.append(text);
            fw.flush();
            fw.close();

        } catch (IOException e) {
            // Catch any IO exceptions.
            e.printStackTrace();
        }

    }
}