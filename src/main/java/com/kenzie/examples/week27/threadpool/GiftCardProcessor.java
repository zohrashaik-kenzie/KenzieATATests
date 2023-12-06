package com.kenzie.examples.week27.threadpool;

public class GiftCardProcessor {
    public static void main(String[] args) {
        GiftCard giftCard = new GiftCard(25);
        Thread depositThread1 = new Thread(new GiftCardDepositer(giftCard, 5));
        Thread depositThread2 = new Thread(new GiftCardDepositer(giftCard, 10));
        giftCard.printBalance();
        depositThread1.start();
        depositThread2.start();
    }
}

