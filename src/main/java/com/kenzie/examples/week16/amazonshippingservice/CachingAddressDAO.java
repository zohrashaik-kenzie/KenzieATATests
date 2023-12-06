package com.kenzie.examples.week16.amazonshippingservice;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.List;

public class CachingAddressDAO {

    private final LoadingCache<String, List<ShippingAddress>> addressCache;
    public CachingAddressDAO(ShippingAddressDAO addressDAO) {
        addressCache = CacheBuilder.newBuilder()
                .build(CacheLoader.from(addressDAO::getAddresses));
    }

    public List<ShippingAddress> getShippingAddresses(String country) {
        System.out.println("Checking in Cache");
        return addressCache.getUnchecked(country);
    }
}