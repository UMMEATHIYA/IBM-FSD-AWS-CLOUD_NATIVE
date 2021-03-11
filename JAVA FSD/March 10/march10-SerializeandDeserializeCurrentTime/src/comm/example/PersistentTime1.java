package comm.example;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class PersistentTime1 implements Serializable {
    transient private Date time;

    public PersistentTime1() {
        time = Calendar.getInstance().getTime();
    }

    public Date getTime() {
        return time;
    }
}
