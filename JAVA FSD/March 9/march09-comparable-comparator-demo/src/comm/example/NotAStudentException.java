package comm.example;

public class NotAStudentException extends RuntimeException{
    private String message;

    public NotAStudentException(String message1) {

        this.message = message1;
    }
}
