package com.example.userspringsecurity.Exception;

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