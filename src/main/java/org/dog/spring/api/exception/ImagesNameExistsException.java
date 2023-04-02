package org.dog.spring.api.exception;

public class ImagesNameExistsException extends RuntimeException {
    private static final long serialVersionUID = 1047278866082093455L;

    public ImagesNameExistsException(String message) {
        super(message);
    }
}
