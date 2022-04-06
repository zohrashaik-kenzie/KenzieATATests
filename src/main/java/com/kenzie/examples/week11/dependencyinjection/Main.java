package com.kenzie.examples.week11.dependencyinjection;

public class Main {
    public static void main(String[] args){
        Service serviceB = new ImprovedServiceB();
        Client clientB = new ImprovedClientA(serviceB);
        System.out.println(clientB.doSomething());

        Service serviceC = new ImprovedServiceC();
        Client clientC = new ImprovedClientA(serviceC);
        System.out.println(clientC.doSomething());

//        ClientA clientA = new ClientA();
//        clientA.service.getInfo();

    }
}
