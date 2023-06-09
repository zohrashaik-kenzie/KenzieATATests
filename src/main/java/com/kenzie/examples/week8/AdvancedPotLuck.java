package com.kenzie.examples.week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdvancedPotLuck {

    HashMap<String, ArrayList<Person>> dishMap;

    public AdvancedPotLuck() {
        dishMap = new HashMap<>();
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        for(Map.Entry<String, ArrayList<Person>> entry : dishMap.entrySet()) {
            sBuilder.append((entry.getKey()));
            sBuilder.append(":");
            ArrayList<Person> aList = entry.getValue();
            for(Person person: aList){
               sBuilder.append(person.getFirstName());
               sBuilder.append(" ");
               sBuilder.append(person.getLastName());
               sBuilder.append("\t");
            }
            sBuilder.append("\n");

        }

        return sBuilder.toString();
    }

    public static void main(String[] args){
        AdvancedPotLuck aPotLuck = new AdvancedPotLuck();
        ArrayList<Person> names1 = new ArrayList();
        Person person = new Person("Zohra","T","Shaik");
        names1.add(person);
        person = new Person("Julia","","Wiecek");
        names1.add(person);

        aPotLuck.dishMap.put("Dish 1", names1);

        ArrayList<Person> names2 = new ArrayList();
        person = new Person("Emily","","Siesel");
        names2.add(person);
        aPotLuck.dishMap.put("Dish 2", names2);

        System.out.println("Your Potluck's dishes are: " + aPotLuck.toString());

    }
}
