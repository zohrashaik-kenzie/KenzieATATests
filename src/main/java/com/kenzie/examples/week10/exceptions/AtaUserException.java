package com.kenzie.examples.week10.exceptions;

public class AtaUserException extends AtaBaseException{
    public AtaUserException(String s,Throwable cause) {

        super(s,cause);
    }

    public AtaUserException(String s) {
        super(s);

    }
}
