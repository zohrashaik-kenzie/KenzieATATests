package com.kenzie.examples.week25.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SampleStream {

    public static void main(String[] args) {
        //Stream stream = Stream.of(1,2,3,4,5,6,7,8,9);
        //2,4,6,8
        //2
       CreateStream stream = new CreateStream();
       stream.createStreamFromNumbers();
       stream.printStream();
//
       stream.createStreamFromArray(new Integer[]{1,2,3,4,5,6,7,8,9});
       stream.printStream();
//
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 10; i< 20; i++){
            list.add(i);
        }
        stream.createStreamFromList(list);
        stream.printStream();
//
       stream.createStreamFromGenerate(20);
     //  stream.printStream();
////
          stream.collectToList();
//        stream.collectToArray();
//
        Employee employee1 = new Employee("100","Zohra","Shaik",3);
        Employee employee2 = new Employee("200","Zack", "Orwick", 2);
        Employee employee3 = new Employee("300","Chi","Nguyen-Rettig",10);
        Employee employee4 = new Employee("400","Ibrahim","Sulayman",1);
//
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(null);
        employees.add(employee4);
//
        EmployeeStream eStream = new EmployeeStream(employees);
      //  eStream.printStream();

//        eStream.convertStreamToArray();
//        eStream.convertStreamToList();
       // eStream.convertStreamToMap();
////
//        // eStream.groupBy();
//
          List<String> names = new ArrayList<>();
          names.add( "Ruby Jane");
          names.add("Zee Jane");
          names.add("Quinn");
          names.add("Joe" );
          names.add ("Joanne");
          names.add ("Mary Jane");
////
////          //intermediate operations
////          //filter
          System.out.println("Filtered names:");
          names.stream().filter((s) -> s.startsWith("J"))
                .forEach(System.out::println);
////
////         //sorted
////        System.out.println("Sorted names in Upper Case:");
        names.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
////
////        //terminal operations
//        boolean matchedResult = names.stream()
//                .anyMatch((s) -> s.startsWith("K"));
////
//        //System.out.println(matchedResult);
////
//        matchedResult = names.stream()
//                .allMatch((s) -> s.startsWith("J"));
//
//        System.out.println(matchedResult);
////
//        matchedResult = names.stream()
//                .noneMatch((s) -> s.startsWith("K"));
//
//        System.out.println(matchedResult);
////
////        //count
////
        long totalMatched = names.stream()
                .filter((s) -> s.startsWith("J"))
                .count();
////
        System.out.println("Matched Names total: " + totalMatched);
////
////        //reduce
        Optional<String> reduced = names.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

       reduced.ifPresent(System.out::println);
//
////        //short-circuit operations
//        String firstMatchedName = names.stream()
//                .filter((s) -> s.startsWith("J"))
//                .findFirst()
//                .get();
////
//        System.out.println("First name that starts with J is");
//        System.out.println(firstMatchedName);
//
////        //stateless
////
//        Optional<String> firstJane =  names.stream()
//                // Stateless - filter
//                .filter(name -> {
//                    System.out.println("filter " + name);
//                    return name.contains("Jane");
//                    // Stateless - map
//                }).map(name -> {
//                    System.out.println("map " + name);
//                    return name.toUpperCase();
//                    // Stateful - sorted
//                }).sorted((name1, name2) -> {
//                    System.out.println(String.format("sorted %s , %s", name1, name2));
//                    return name1.compareTo(name2);
//                }).findFirst();
//        System.out.println(firstJane);
    }
}
