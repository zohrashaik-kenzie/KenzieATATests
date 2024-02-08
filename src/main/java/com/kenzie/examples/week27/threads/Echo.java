package com.kenzie.examples.week27.threads;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

class Echo implements Callable<String> {
    private  final String str;

    public Echo(String str) {this.str = str;}

    @Override
    public String call() {
         return str;
    }

    public static void main(String[] args) throws ExecutionException,
            InterruptedException, TimeoutException {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Echo echo1 = new Echo("Hello World 1");
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        callables.add(echo1);

        Echo echo2 = new Echo("Hello World 2");
        callables.add(echo2);

        Echo echo3 = new Echo("Hello World 3");
        callables.add(echo3);

        Echo echo4 = new Echo("Hello World 4");
        callables.add(echo4);

        Echo echo5 = new Echo("Hello World 5");
        callables.add(echo5);

        List<Future<String>> futures = executor.invokeAll(callables);

        for(Future<String> future : futures){
            System.out.println("future.get = " + future.get());
        }
        executor.shutdown();
    }
}