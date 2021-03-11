package comm;

public class Tester1 {
    public static void main(String args[])
    {
        MyParent myparent1=new MySubClass1();
        myparent1.Message();
        MyParent myparent2=new MySubClass2();
        myparent2.Message();
        //System.out.println(MyService.MAX);
    }
}
