package comm.example;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.stream.Collectors;

public class Property {
    public static void main (String args[])
    {
        Properties prop=new Properties();
        prop.setProperty("user.name","admin");
        prop.setProperty("password","1234");
        prop.setProperty("url","demo url");
        prop.setProperty("a","10");
        System.out.println(prop.getProperty("user.name"));
        Collection collection=prop.values();
        boolean val=prop.containsKey("User.name");
        System.out.println(val);
        Enumeration e=prop.keys();
        Iterator i=e.asIterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println(collection);
    }
}
