package com.kenzie.examples.week27.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceCASExample {
    private static class Student implements Comparable<Student> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.id, other.id);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        AtomicReference<Student> currentMax = new AtomicReference<>(null);

        Student[] students = {
                new Student(101, "Alice"),
                new Student(103, "Bob"),
                new Student(102, "Carol"),
                new Student(105, "David"),
                new Student(104, "Eve")
        };

        for (Student student : students) {
            while (true) {
                Student current = currentMax.get();
                if (current == null || student.compareTo(current) > 0) {
                    if (currentMax.compareAndSet(current, student)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println("Student with the highest ID: " + currentMax.get());
    }
}