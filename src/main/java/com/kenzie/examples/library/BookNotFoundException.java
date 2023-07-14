package com.kenzie.examples.library;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String bookTitle) {
        super(bookTitle + " was not found in the Library.");
    }
}