package org.dog.spring.api.exception;

public class NeedmentsDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 7471504264442723233L;

    public NeedmentsDogResourceNotFoundException(String message) {
        super(message);
    }
}