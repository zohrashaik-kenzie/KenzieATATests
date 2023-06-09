package com.kenzie.examples.week8;

public class EqualityDemo {

    public static void main(String[] args){

        Person person1 = new Person("Zohra","T","Shaik");
        Person person2 = new Person("Zohra","","Shaik");
        System.out.println(person1.equals(person2));

        int hashCode1 = person1.hashCode();
        int hashCode2 = person2.hashCode();

        if(hashCode1 == hashCode2){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
