package comm.example;

public class Tester {

    public static void main(String args[])
    {
        int a=10;
        int b=10;
        Todo todo1=new Todo(1,"Demo");
        Todo todo2=new Todo(1,"Demo");
        System.out.print((todo1==todo2)+"\n");
        System.out.println(todo1.equals(todo2));

        //boxing
        Integer i=new Integer(10);
        System.out.println(i);
        //Auto Boxing
        Integer j=10;
        System.out.println("j="+j);

    }
}