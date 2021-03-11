package comm.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeDate {
    SerializeDate(){
        Date d = new Date();
        try{
            FileOutputStream f = new FileOutputStream("date.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(d);
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        new SerializeDate();
    }

}
