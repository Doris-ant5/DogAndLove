package org.dog.spring.api.exception;

public class HealthDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 2602314271762452364L;

    public HealthDogResourceNotFoundException(String message) {
        super(message);
    }
}