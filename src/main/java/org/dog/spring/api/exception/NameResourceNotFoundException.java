package org.dog.spring.api.exception;

public class NameResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -930246227051168709L;

    public NameResourceNotFoundException(String message) {
        super(message);
    }
}
