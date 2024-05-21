package com.kenzie.examples.week29.patterns.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args){
        //boolean isUserLoggedIn= UserManagerService.isUserLoggedIn();
        boolean isUserLoggedIn= true;
        User user=new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();
    }
}
