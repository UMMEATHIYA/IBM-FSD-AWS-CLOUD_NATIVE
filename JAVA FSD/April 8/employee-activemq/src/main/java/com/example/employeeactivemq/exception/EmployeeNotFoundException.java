package com.example.employeeactivemq.exception;

public class EmployeeNotFoundException extends RuntimeException {
    private String message;

    public EmployeeNotFoundException(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
