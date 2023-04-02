package org.dog.spring.api.exception;

public class CastrationDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -8216315874568132583L;

    public CastrationDogResourceNotFoundException(String message) {
        super(message);
    }
}
