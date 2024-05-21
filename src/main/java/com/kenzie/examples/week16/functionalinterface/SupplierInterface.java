package com.kenzie.examples.week16.functionalinterface;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args){
        // The list we're working with
        List<String> participants = ImmutableList.of("Person0", "Person1", "Person2","Person3","Person4","Person5","Person6");
       // Find a random number
        SupplierImpl si = new SupplierImpl();
        // The call that takes our supplier
        callOnParticipants(() -> si.get(),participants);
    }


    private static  void callOnParticipants(Supplier<Integer> indexChooser, List<String> studentList) {
        // Our random number supplier uses the scope in which it was declared
        // We can access the participants from main
        Integer randomIndex = indexChooser.get();
        String person = studentList.get(randomIndex);
        System.out.println(person + ", can you please share your answer?");
        System.out.println("Thank you.");
    }
}
