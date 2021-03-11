package comm.demo;

import java.io.*;

public class SerializeAnimationThreadNotStarted {
    public static void main(String[] args) {

        // Create an object instance
        PersistentAnimation a = new PersistentAnimation(1);

        // Serialize the object
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream("serializedfile");
            out = new ObjectOutputStream(fos);
            out.writeObject(a);
            out.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        PersistentAnimation1 b = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream("serializedfile");
            in = new ObjectInputStream(fis);
            b = (PersistentAnimation1)in.readObject();
            in.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
