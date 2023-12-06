package com.kenzie.examples.week16.amazonshippingservice;

public class AmazonShippingDemo {

    public static void main(String[] args){
        ShippingAddressDAO shippingDAO = new ShippingAddressDAO();
        CachingAddressDAO cacheDAO = new CachingAddressDAO(shippingDAO);
        cacheDAO.getShippingAddresses("USA");
        cacheDAO.getShippingAddresses("Canada");
        cacheDAO.getShippingAddresses("USA");
    }
}
