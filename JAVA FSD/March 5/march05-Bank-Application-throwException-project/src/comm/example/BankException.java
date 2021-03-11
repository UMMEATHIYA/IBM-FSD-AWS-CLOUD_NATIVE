package comm.example;

public class BankException extends RuntimeException{
    private String message;

    public BankException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
