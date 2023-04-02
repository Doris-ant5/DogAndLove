package org.dog.spring.api.exception;

public class NameDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 4714772162655114217L;

    public NameDogResourceNotFoundException(String message) {
        super(message);
    }
}
