package org.dog.spring.api.exception;

public class VaxResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -210677464169571952L;

    public VaxResourceNotFoundException(String message) {
        super(message);
    }
}
