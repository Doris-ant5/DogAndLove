package org.dog.spring.api.exception;

public class BirthDateResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 6066146520443253332L;

    public BirthDateResourceNotFoundException(String message) {
        super(message);
    }
}
