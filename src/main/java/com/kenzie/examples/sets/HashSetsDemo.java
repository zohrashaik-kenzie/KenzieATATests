package com.kenzie.examples.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetsDemo {

    public static void main(String[] args){
        FreshFruit seededApple =  new FreshFruit("Apple",false);
        FreshFruit seedlessApple =  new FreshFruit("Apple",true);
        FreshFruit seedlessGrape = new FreshFruit("Grape", false);
        FreshFruit seededApple2 =  new FreshFruit("Apple",false);

        Set<FreshFruit> fruitsOffered = new HashSet<>();
        fruitsOffered.add(seededApple);
        fruitsOffered.add(seedlessGrape);
        fruitsOffered.add(seedlessApple);
        fruitsOffered.add(seededApple2);

        for(FreshFruit ff: fruitsOffered)
            System.out.println(ff.toString());


        //contains method
//        FreshFruit appleCheck = new FreshFruit("apple", false);
//        boolean isPresent = fruitsOffered.contains(appleCheck);
    }
}
