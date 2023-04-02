package org.dog.spring.api.exception;

public class ResourceDogByIdNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 5282342524739368141L;

    public ResourceDogByIdNotFoundException(String message) {
        super(message);
    }
}
