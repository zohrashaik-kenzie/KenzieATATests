package com.kenzie.examples.week16.functionalinterface;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class ConsumerInterface {

    public static void main(String[] args){
        List<String> customerNames = fetchCustomerNames(); // fetchCustomerNames() grabs a list of customers from an API somewhere else
// The two implementations below are the same - shorthand and longhand
        customerNames.forEach(name -> {
            System.out.println("Customer name: " + name);
        });

        customerNames.forEach(name -> System.out.println("Customer name: " + name));
    }

    private static List<String> fetchCustomerNames(){
        return ImmutableList.of("Google", "Facebook", "Apple");
    }
}
