package com.kenzie.examples.week11.dependencyinjection;

public class ImprovedClientA implements Client{
    Service service;

    public ImprovedClientA(Service service) {
        this.service = service;
    }
    @Override
    public String doSomething() {
        return service.getInfo();
    }
}
