package com.kenzie.examples.week26.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
    // Create the runnable
    static Runnable printThread = () -> {
        System.out.println(Thread.currentThread().getName()
                + ", executing run() method!");

    };
    public static void main(String[] args) throws ExecutionException, InterruptedException {      // Create the service!
        ExecutorService executor = Executors.newCachedThreadPool();
        // Submit the runnable directly
        Future future = executor.submit(printThread);
        System.out.println(future.get());
        executor.submit(printThread);
        executor.submit(printThread);
        executor.submit(printThread);
        executor.submit(printThread);

        // Shutdown the service
        executor.shutdown();
    }

}
