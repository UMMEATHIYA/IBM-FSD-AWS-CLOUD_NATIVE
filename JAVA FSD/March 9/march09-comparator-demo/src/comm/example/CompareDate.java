package comm.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public  class CompareDate implements Comparator{
    @Override
    public int compare(Object o, Object t1) {
        Tod todo1=(Tod) o;
        Tod todo2=(Tod) t1;
        if(todo1.getTargetDate()==todo2.getTargetDate())
        {
            return 0;
        }
        else if(todo1.getTargetDate().before(todo2.getTargetDate()))
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
