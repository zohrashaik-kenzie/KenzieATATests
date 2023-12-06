package com.kenzie.examples.week16.methodreferences;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CachingDao {
    private final LoadingCache<String, String> cache;
    public CachingDao(final DelegateDao delegateDao) {
        this.cache = CacheBuilder.newBuilder()
                // Creates a cache with a loader that gets data with a call to getDataFromDatabase
                //.build(CacheLoader.from(key -> delegateDao.getDataFromDatabase(key) ));
         .build( CacheLoader.from(delegateDao::getDataFromDatabase ));
    }
}