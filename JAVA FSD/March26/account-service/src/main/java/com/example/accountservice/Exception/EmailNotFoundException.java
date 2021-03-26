package com.example.accountservice.Exception;

public class EmailNotFoundException extends IllegalArgumentException {
    private String message;

    public EmailNotFoundException(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}