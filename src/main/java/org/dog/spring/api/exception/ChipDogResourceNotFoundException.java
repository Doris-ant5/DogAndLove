package org.dog.spring.api.exception;

public class ChipDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 3254918741505051062L;

    public ChipDogResourceNotFoundException(String message) {
        super(message);
    }
}