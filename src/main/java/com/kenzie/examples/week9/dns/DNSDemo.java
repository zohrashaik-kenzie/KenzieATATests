package com.kenzie.examples.week9.dns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DNSDemo {

    static HashMap<String,HashMap<String,String>> globalDNS= new HashMap<>();

    private static void initInternet(){
        HashMap<String,String> dns = new HashMap<>();
        dns.put("developer.amazon.com","192.43.24.112");
        dns.put("api.amazon.com","192.43.24.114");
        dns.put("products.amazon.com","192.43.24.113");
        dns.put("mysiteonaws.com","192.23.133.12");
        dns.put("anothersiteonaws.com","182.13.23.11");
        globalDNS.put("Amazon", dns);

        dns = new HashMap<>();
        dns.put("developer.facebook.com","215.43.24.112");
        dns.put("meta.com","216.43.24.114");
        dns.put("universe.com","215.43.24.113");

        globalDNS.put("Facebook", dns);
    }

    public static String getIPAddress(String url, String group){
        initInternet();
        HashMap<String,String> dns = globalDNS.get(group);
        return dns.get(url);
    }

    public static void main(String[] args){
        String ipAddress = getIPAddress("developer.amazon.com", "Amazon");
        System.out.println(ipAddress);
    }

}
