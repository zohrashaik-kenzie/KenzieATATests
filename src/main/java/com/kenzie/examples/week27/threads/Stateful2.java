package com.kenzie.examples.week27.threads;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class Stateful2 implements Callable<String>{
    private static int count = 0;

    public Stateful2() {}

    public static void setCount(int  c)
    {
        count = c;
    }
    @Override
    public String call() throws InterruptedException {
            count++;
            return count + "";
    }

    public static void main(String[] args) throws ExecutionException,
            InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Stateful2 s1 = new Stateful2();
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        callables.add(s1);

        Stateful2 s2 = new Stateful2();
        callables.add(s2);

        Stateful2 s3 = new Stateful2();
        callables.add(s3);
        Stateful2 s4 = new Stateful2();
        callables.add(s4);
        Stateful2 s5 = new Stateful2();
        callables.add(s5);

        List<Future<String>> futures = executor.invokeAll(callables);

        for(Future<String> future : futures){
            System.out.println("future.get = " + future.get());
        }
        executor.shutdown();
    }
}

