package com.kenzie.examples.week9.singleton;

public class DeckOfCards {
    static DeckOfCards deck;
    int number_of_cards;
    private DeckOfCards() {
        number_of_cards = 52;
    }

    public int drawCard(){
        number_of_cards--;
        return number_of_cards;
    }

   public static DeckOfCards getInstance(){
        if (deck == null){
            deck = new DeckOfCards();
        }

        return deck;
   }
}
