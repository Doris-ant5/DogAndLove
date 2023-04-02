package org.dog.spring.api.exception;

public class DogNameExistsException extends RuntimeException {
    private static final long serialVersionUID = -1921843385770486970L;

    public DogNameExistsException(String message) {
        super(message);
    }
}
