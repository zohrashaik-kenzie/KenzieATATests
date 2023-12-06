package com.kenzie.examples.week27.atomic;

public class GiftCardDepositer implements Runnable {
    private GiftCard giftCard;
    private int amount;
    public GiftCardDepositer(GiftCard giftCard, int deposit) {
        this.giftCard = giftCard;
        amount = deposit;
    }
    public void run() {
        giftCard.addBalance(amount);
    }
}
