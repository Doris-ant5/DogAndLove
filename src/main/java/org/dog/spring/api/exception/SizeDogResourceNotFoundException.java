package org.dog.spring.api.exception;

public class SizeDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -8216315874568132583L;

    public SizeDogResourceNotFoundException(String message) {
        super(message);
    }
}
