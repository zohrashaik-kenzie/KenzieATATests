package com.kenzie.examples.week16.methodreferences;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class CapitalizeStrings {

    public static void main(String[] args){
        List<String> messages = Arrays.asList("hello", "kenzie", "learners!");
        messages.forEach(word -> System.out.println(StringUtils.capitalize(word)));
        messages.forEach(StringUtils::capitalize);
        messages.forEach(System.out::println);
    }
}
