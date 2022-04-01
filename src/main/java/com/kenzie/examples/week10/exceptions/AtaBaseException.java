package com.kenzie.examples.week10.exceptions;

public class AtaBaseException extends Exception {
    public AtaBaseException(String s, Throwable cause) {
         super(s,cause);
    }

    public AtaBaseException(String message) {
        super(message);
    }

}
