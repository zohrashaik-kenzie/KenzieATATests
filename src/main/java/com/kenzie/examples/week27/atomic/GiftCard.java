package com.kenzie.examples.week27.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class GiftCard {
    private AtomicInteger balance;
    public GiftCard(int initialBalance) {
        balance = new AtomicInteger();
        this.balance.set(initialBalance);
    }
    public void printBalance() {
        System.out.println("Current Balance is: " + balance);
    }
    public  void addBalance(int addAmount) {
        System.out.println("Balance is " + balance);
        balance.addAndGet(addAmount);
        System.out.println("Added " + addAmount + ", new balance is " + balance);
    }
}