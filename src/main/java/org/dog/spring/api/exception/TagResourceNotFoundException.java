package org.dog.spring.api.exception;

public class TagResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -7025887847659512069L;

    public TagResourceNotFoundException(String message) {
        super(message);
    }
}
