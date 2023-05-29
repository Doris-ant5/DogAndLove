package org.dog.spring.api.exception;

public class ImageResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 5000359609788228622L;
    public ImageResourceNotFoundException(String message) {

        super(message);
    }
}
