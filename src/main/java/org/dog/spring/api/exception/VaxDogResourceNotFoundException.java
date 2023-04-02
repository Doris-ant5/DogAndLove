package org.dog.spring.api.exception;

public class VaxDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -2059033007826196112L;

    public VaxDogResourceNotFoundException(String message) {
        super(message);
    }
}