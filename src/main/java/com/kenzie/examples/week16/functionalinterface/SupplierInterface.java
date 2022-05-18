package com.kenzie.examples.week16.functionalinterface;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args){
        // The list we're working with
        List<String> participants = ImmutableList.of("Ana", "Mary", "Carlos");
       // Find a random number
        Random random = new Random();
      // Get a random number that's within the length of the original list
        Supplier<Integer> randomIndexGenerator = () -> random.nextInt(participants.size());

        // The call that takes our supplier
        callOnParticipants(randomIndexGenerator,participants);
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
