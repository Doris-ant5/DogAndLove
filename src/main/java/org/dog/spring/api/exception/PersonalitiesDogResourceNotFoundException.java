package org.dog.spring.api.exception;

public class PersonalitiesDogResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -7815493792397063614L;

    public PersonalitiesDogResourceNotFoundException(String message) {
        super(message);
    }
}