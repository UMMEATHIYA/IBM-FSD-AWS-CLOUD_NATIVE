package comm.example;

public class Student implements Comparable{
    private int studentId;
    private String name;
    private double gpa;

    public Student(int studentId, String name, double gpa) {
        if((studentId==0) ||(name==null) ||(gpa==0.0))
        {
            throw new NotAStudentException("invalid student");
        }
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student)o;
        double result=this.gpa-student.gpa;
        if(result==0.0)
            return 0;
        else if (result<0.0)
        {
            return -1;
        }
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
