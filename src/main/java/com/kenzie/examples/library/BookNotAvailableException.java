package com.kenzie.examples.library;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException(String bookTitle) {
        super(bookTitle + " has already been checked out.  Please try again later.");
    }
}
