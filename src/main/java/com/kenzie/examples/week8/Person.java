package com.kenzie.examples.week8;

import java.util.Objects;

public class Person {
    String firstName;
    String middleInitial;
    String lastName;

    public Person(String firstName, String middleInitial, String lastName) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                getMiddleInitial().equals(person.getMiddleInitial() );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getMiddleInitial());
    }
}
