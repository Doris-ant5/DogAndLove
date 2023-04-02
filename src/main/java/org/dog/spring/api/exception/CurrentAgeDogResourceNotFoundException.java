package org.dog.spring.api.exception;

public class CurrentAgeDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1395385842925116280L;

    public CurrentAgeDogResourceNotFoundException(String message) {
        super(message);
    }
}