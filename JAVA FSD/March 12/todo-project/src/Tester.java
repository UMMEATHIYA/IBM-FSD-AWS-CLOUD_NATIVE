public class Tester {
    Todo todos[];
    public Tester() {
        todos=new Todo[5];
    }
    public static void main(String args[])
    {
        Tester tester=new Tester();
        for(int i=0;i<5;i++)
        {
            tester.todos[i]=new Todo(i,"java",false);
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(tester.todos[i].getDetails());
        }
    }
}