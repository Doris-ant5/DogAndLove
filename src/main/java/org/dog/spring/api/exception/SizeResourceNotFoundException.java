package org.dog.spring.api.exception;

public class SizeResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -462886425087940153L;

    public SizeResourceNotFoundException(String message) {
        super(message);
    }
}
