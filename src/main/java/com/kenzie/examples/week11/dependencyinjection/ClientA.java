package com.kenzie.examples.week11.dependencyinjection;

public class ClientA {
    ServiceB service;

    public void doSomething() {
        String info = service.getInfo();
    }
}
