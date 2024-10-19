package week06Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards; // a list that holds 52 cards

    public Deck() {  // constructor to create and populate the deck 
        cards = new ArrayList<>(52);
        String[] suits = {"Hearts♥", "Diamonds♦", "Clubs♠", "Spades♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Create the deck of 52 cards
        for(String suit : suits) {
        for (int i = 0; i < ranks.length; i++) {
            int value; 
                if (i < 10) {
                    value = i + 2; // for ranks 2 to 10
                } else if (i == 10) {
                    value = 11;   // for Jack
                } else if (i == 11) {
                    value = 12;    // for Queen
                } else if (i == 12) {
                    value = 13;   // for King
                } else {
                    value = 14;   // for Ace
                }
                cards.add(new Card(value, ranks[i] + " of " + suit)); // adds card to list
            }
        
        shuffle(); // shuffles the deck upon creation
        }
}
    public void shuffle() {  // defines method that shuffles the deck
        Collections.shuffle(cards);
    }

    public Card draw() {  // defines method to draw the top card from deck
        return cards.isEmpty() ? null : cards.remove(0); // returns null if deck is empty
    }
}
