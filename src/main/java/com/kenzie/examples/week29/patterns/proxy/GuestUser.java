package com.kenzie.examples.week29.patterns.proxy;

public class GuestUser implements User{
    @Override
    public void checkOut() {
        System.out.print("Showing Registration Page");
    }
}
