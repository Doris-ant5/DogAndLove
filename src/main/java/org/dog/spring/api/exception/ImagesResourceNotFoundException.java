package org.dog.spring.api.exception;

public class ImagesResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -1820487554878260990L;

    public ImagesResourceNotFoundException(String message) {
        super(message);
    }
}

