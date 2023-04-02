package org.dog.spring.api.exception;

public class ChipResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 6066146520443253332L;

    public ChipResourceNotFoundException(String message) {
        super(message);
    }
}
