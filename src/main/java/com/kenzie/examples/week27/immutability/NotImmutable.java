package com.kenzie.examples.week27.immutability;

import java.util.concurrent.ExecutionException;

public final class NotImmutable {

    private final Person bob;

    public NotImmutable(){
        bob = new Person();
    }

    public NotImmutable(Person other){
//        bob = new Person();
//        bob.age = other.age;
//        bob.name = other.name;
        bob = other;
    }

    public void print(){
        System.out.println(bob.toString());
    }

    public Person getPerson(){
//        Person toReturn = new Person();
//        toReturn.age = bob.age;
//        toReturn.name = bob.name;
//        return toReturn;
        return bob;
    }

    public static void main(String[] args) {
        Person person = new Person();

        NotImmutable thing = new NotImmutable(person);

        thing.print();

        person.age = 80;
        person.name = "bob";

        thing.print();

        thing = new NotImmutable(person);

        thing.print();

    }

}
