package com.kenzie.examples.week25.streams;

public class Employee {


    String id;
    String firstName;
    String lastName;
    int tenure;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTenure() {
        return tenure;
    }

    public char getFirstNameFirstLetter(){
        return this.firstName.charAt(0);
    }

    public char getLastNameFirstLetter(){
        return this.lastName.charAt(0);
    }

    public Employee( String id, String firstName, String lastName, int tenure) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tenure = tenure;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return firstName + " " + lastName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
