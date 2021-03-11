package comm.example;

public class NotAEmployeeException extends RuntimeException{
    private String message;

    public NotAEmployeeException(String message1) {

        this.message = message1;
    }
}
