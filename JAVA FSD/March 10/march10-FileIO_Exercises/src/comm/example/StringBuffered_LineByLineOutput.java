package comm.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBuffered_LineByLineOutput {
    public static void main(String args[]) throws IOException {
        try {
            FileReader input = new FileReader("foo.txt");
            BufferedReader bufInput = new BufferedReader(input);

            int i = bufInput.read();
            while (i != -1) {
                System.out.println((char) i);
                i = bufInput.read();
            }
            bufInput.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
