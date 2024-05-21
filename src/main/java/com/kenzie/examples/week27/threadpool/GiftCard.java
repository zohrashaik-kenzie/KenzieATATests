package com.kenzie.examples.week27.threadpool;

public class GiftCard {
    private int balance;
    private int dayBalance;
    public GiftCard(int initialBalance) {
        balance  = initialBalance;
        dayBalance = initialBalance;
    }
    public void printBalance() {
        System.out.println("Current Balance is: " + balance);
    }
    public  void addBalance(int addAmount) {
        System.out.println("Balance is " + balance);
        balance =  balance + addAmount;
        dayBalance += addAmount;
        System.out.println("Added " + addAmount + ", new balance is " + balance);
    }
}