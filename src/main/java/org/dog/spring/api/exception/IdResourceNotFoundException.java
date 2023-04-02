package org.dog.spring.api.exception;

public class IdResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 7588622996133477515L;

    public IdResourceNotFoundException(String message) {
        super(message);
    }
}
