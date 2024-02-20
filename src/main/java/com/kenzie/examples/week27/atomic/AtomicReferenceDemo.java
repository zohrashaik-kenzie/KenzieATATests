package com.kenzie.examples.week27.atomic;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDemo {

    public static void main(String[] args) throws InterruptedException {
            final AtomicReference<String> sharedString = new AtomicReference<>("Initial Value");

            Runnable task = new Runnable() {
                @Override
                public void run() {
                    String expectedValue = "Initial Value";
                    String newValue = "Updated by Thread";
                    boolean wasUpdated = sharedString.compareAndSet(expectedValue, newValue);

                    if (wasUpdated) {
                        System.out.println("String updated successfully.");
                    } else {
                        System.out.println("Update failed. Expected value did not match.");
                    }
                }
            };

            Thread thread = new Thread(task);
            thread.start();
            thread.join();

            System.out.println("Final value: " + sharedString.get());
        }
    }


