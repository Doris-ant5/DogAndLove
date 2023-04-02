package org.dog.spring.api.exception;

public class SexDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -1493387110757041621L;

    public SexDogResourceNotFoundException(String message) {
        super(message);
    }
}