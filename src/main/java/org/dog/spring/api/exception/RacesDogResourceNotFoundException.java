package org.dog.spring.api.exception;

public class RacesDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3682760795008272738L;

    public RacesDogResourceNotFoundException(String message) {
        super(message);
    }
}
