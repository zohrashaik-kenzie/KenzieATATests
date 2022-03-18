package com.kenzie.examples.statics;

public class Student implements CommonConstants{

    private String firstName;
    private String lastName;
    private String section;
    private static String numberOfStudents;
    private int rollnumber;
    private String batch;


        private static String getCourseName(){
        return COURSE_NAME;
    }
    public Student(String firstName, String lastName, String section, int rollnumber, String batch) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
        this.rollnumber = rollnumber;
        this.batch = batch;
    }



}

