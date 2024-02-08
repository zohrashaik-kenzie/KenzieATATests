package com.kenzie.examples.week26.executor;

import java.util.concurrent.*;

public class CallableDemo {
    // Create the Callable
    static Callable printThread = () -> {
        System.out.println(Thread.currentThread().getName()
                + ", executing run() method!");
       // throw new FileNotFoundException();
       return "All is well!";
    };
    public static void main(String[] args) throws ExecutionException, InterruptedException {      // Create the service!
        ExecutorService executor = Executors.newCachedThreadPool();
        // Submit the runnable directly
         Future future = executor.submit(printThread);
         System.out.println(future.get());
        // Shutdown the service
        executor.shutdown();
    }
}
