package com.kenzie.examples.week9.singleton;

public class Application {

    public static void main(String[] args){

        DeckOfCards deck1 = DeckOfCards.getInstance();
        int number_of_cards = deck1.drawCard();
        System.out.println("Number of cards: " + number_of_cards);
        DeckOfCards deck2 = DeckOfCards.getInstance();
        number_of_cards = deck2.drawCard();
        System.out.println("Number of cards: " + number_of_cards);
        return;
    }
}
