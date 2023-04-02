package org.dog.spring.api.exception;

public class CastrationResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 2829876857056921167L;

    public CastrationResourceNotFoundException(String message) {
        super(message);
    }
}
