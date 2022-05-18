package com.kenzie.examples.week16.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GuavaCachingDemo {

    private void cacheData() {
        try {
            // create builder object
            CacheBuilder<Object, Object> builder = CacheBuilder.newBuilder();
            // create cache loader object
            CacheLoader<String, Website> loader = new CacheLoader<String, Website>() {
                @Override
                public Website load(String key) throws Exception {
                    // get data from source
                    return fetchWebsite(key);
                }
            };
            // create cache
            LoadingCache<String, Website> cache = builder.build(loader);
            // fetch websites from cache
            Website w = cache.get("Google");
            System.out.println("Website fetched is: " + w.getName());
            w = cache.get("Facebook");
            System.out.println("Website fetched is: " + w.getName());
            w = cache.get("Apple");
            System.out.println("Website fetched is: " + w.getName());
            // fetch a website once again
            System.out.println("Trying to get same data again...");
            w = cache.get("Google");

            System.out.println("Website fetched is: " + w.getName());
            System.out.println("Total items in cache: " + cache.size());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
    private Website fetchWebsite(String name) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fetching website from source: " + name);
        return new Website(name);
    }

    public static void main(String args[]) {

        new GuavaCachingDemo().cacheData();
    }

}
