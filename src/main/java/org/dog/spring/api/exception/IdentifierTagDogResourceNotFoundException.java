package org.dog.spring.api.exception;

public class IdentifierTagDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 4673591893260424029L;

    public IdentifierTagDogResourceNotFoundException(String message) {
        super(message);
    }
}
