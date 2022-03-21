package com.kenzie.examples.week9.dns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DNSDemo {

    static HashMap<String,String> dns = new HashMap<>();

    private void initInternet(){
        dns.put("www.amazon.com","216.22.231.13");
        dns.put("www.google.com","192.43.24.112");
        dns.put("www.facebook.com","122.122.13.12");
    }

    public static String getIPAddress(String url){
        //ask the learners what they would do here
        return dns.get(url);
    }

    public static void main(String[] args){
        String ipAddress = getIPAddress("www.amazon.com");
        System.out.println(ipAddress);
    }

}
