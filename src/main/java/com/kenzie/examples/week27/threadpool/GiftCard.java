package com.kenzie.examples.week27.threadpool;

import java.util.concurrent.atomic.AtomicInteger;

public class GiftCard {
    private AtomicInteger balance;
    private AtomicInteger dayBalance;
    public GiftCard(int initialBalance) {
        balance  = new AtomicInteger();
        dayBalance = new AtomicInteger();
        dayBalance.set(0);
        this.balance.set(initialBalance);
    }
    public void printBalance() {
        System.out.println("Current Balance is: " + balance);
    }
    public  void addBalance(int addAmount) {
        System.out.println("Balance is " + balance);
        balance.addAndGet(addAmount);
        dayBalance.addAndGet(addAmount);
        System.out.println("Added " + addAmount + ", new balance is " + balance);
    }
}