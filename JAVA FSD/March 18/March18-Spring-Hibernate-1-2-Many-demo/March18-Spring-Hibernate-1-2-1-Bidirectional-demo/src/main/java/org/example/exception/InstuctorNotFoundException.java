package org.example.exception;

import org.example.entity.Instructor;

public class InstuctorNotFoundException extends RuntimeException{
    private String message;

    public InstuctorNotFoundException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
