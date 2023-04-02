package org.dog.spring.api.exception;

public class DogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -5819375071238520390L;

    public DogResourceNotFoundException(String message) {
        super(message);
    }

}
