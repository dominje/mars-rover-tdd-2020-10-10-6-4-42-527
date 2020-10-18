package com.afs.tdd.exception;

public class CommandNotDefinedException extends RuntimeException{
    public CommandNotDefinedException(String message) {
        super(message);
    }
}
