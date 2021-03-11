package comm.example;

public class Todo {
    private int id;
    private String desc;

    public Todo() {
    }

    public Todo(int id,String desc)
    {
        this.id=id;
        this.desc=desc;
    }

    public int getId(){
        return id;
    }

    public void setID(int id)
    {
        this.id=id;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc=desc;
    }

    @Override
    public boolean equals(Object o)
    {
        Todo tempTodo=null;
        if(o instanceof Todo)
        {
            tempTodo=(Todo) o;
        }

        if(this.getId()== tempTodo.getId() && this.getDesc()==tempTodo.getDesc())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
