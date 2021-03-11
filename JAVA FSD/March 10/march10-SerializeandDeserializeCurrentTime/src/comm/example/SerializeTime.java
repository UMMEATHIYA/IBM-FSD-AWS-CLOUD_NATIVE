package comm.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTime {
    public static void main(String [] args){

        String filename = "time.ser";
        if(args.length > 0) {
            filename = args[0];
        }

        // Create an object
        PersistentTime2 time = new PersistentTime2();

        // Serialize the object instance and save it in
        // a file.
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Current time is saved into " + filename);
    }
}
