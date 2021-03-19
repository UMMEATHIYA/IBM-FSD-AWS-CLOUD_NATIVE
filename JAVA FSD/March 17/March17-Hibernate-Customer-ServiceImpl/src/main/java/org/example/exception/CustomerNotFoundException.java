package org.example.exception;

public class CustomerNotFoundException extends RuntimeException{
    private String message;

    public CustomerNotFoundException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
