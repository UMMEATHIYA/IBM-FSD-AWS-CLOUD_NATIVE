package com.example.accountservice.Exception;

public class AccountNotFoundException extends RuntimeException {
    private String message;

    public AccountNotFoundException(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}