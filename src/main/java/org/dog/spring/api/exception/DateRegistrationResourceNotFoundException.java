package org.dog.spring.api.exception;

public class DateRegistrationResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 6974431041635282585L;

    public DateRegistrationResourceNotFoundException(String message) {
        super(message);
    }
}
