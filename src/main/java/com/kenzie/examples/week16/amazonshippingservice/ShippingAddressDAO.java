package com.kenzie.examples.week16.amazonshippingservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShippingAddressDAO {
    Map<String,List<ShippingAddress>> map = new HashMap<>();
    public ShippingAddressDAO() {
        //initilaize data
        ShippingAddress address1 = new ShippingAddress("123 Main Street","Chicago","IL", "USA");
        ShippingAddress address2 = new ShippingAddress("123 Main Street","Chicago","IL", "USA");
        ShippingAddress address3 = new ShippingAddress("456 Cornwell Road",null,"Toronto", "Canada");

        List<ShippingAddress> addressList = new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);
        map.put("USA", addressList);
        addressList.clear();
        addressList.add(address3);
        map.put("Canada", addressList);
    }

    public List<ShippingAddress> getAddresses(String country) {
        System.out.println("Going to Service because: " + country + " not found in cache" );
        return map.get(country);
    }
}
