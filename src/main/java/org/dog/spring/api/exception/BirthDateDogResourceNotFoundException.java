package org.dog.spring.api.exception;

public class BirthDateDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -9059144602861831473L;

    public BirthDateDogResourceNotFoundException(String message) {
        super(message);
    }
}
