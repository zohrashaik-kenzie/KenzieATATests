package com.kenzie.examples.week29.patterns.proxy;

public class AuthorizedUser implements User{
    @Override
    public void checkOut() {
        System.out.print("checking out...");
    }
}
