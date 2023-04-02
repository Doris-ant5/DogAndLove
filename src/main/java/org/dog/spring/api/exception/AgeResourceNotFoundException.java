package org.dog.spring.api.exception;

public class AgeResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3513598997202069960L;

    public AgeResourceNotFoundException(String message) {
        super(message);
    }
}
