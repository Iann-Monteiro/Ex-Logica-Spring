package com.iannlucas.Course.Services.Exceptions;

public class DatabaseException extends RuntimeException{

    public static final long serialVersionUID = 1L;

    public DatabaseException(String message) {
        super(message);
    }
}
