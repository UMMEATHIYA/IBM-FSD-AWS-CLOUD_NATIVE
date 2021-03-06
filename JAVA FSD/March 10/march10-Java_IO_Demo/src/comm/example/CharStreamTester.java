package comm.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamTester {
    public static void main(String args[]) throws IOException {
        File inputFile=new File("foo.txt");
        File outputFile=new File("out.txt");

        FileReader reader=new FileReader(inputFile);
        FileWriter writer=new FileWriter(outputFile);
        char[] buffer=new char[128];
        int charRead;
        try {
            charRead=reader.read(buffer);
            while (charRead!=-1)
            {
                System.out.print(charRead+" ");
                writer.write(buffer,0,charRead);
                charRead=reader.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
            writer.close();
        }

    }
}
