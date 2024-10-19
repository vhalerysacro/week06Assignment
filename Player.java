package week06Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> hand; // player's hand of cards
    private int score;              // player's scores
    private final String name;      // player's names

    public Player(String name) { // constructor to create a player
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0; // initializes score to 0
    }

    public void describe() { // defines method to describe the player and their cards
        System.out.println(name + " draws...");
        for (Card card : hand) {
            card.describe();
        }
        System.out.println("Score: " + score);
    }

    public Card flip() {    // defines method to flip the top of the card from the hand
        return hand.isEmpty() ? null : hand.remove(0); // returns null if hand is empty
     }

    public void draw(Deck deck) { // defines method to draw a card from the deck
        Card drawnCard = deck.draw();
        if (drawnCard != null) { // if drawnCard is null, this means deck was empty
            hand.add(drawnCard); //adds to player's hand
        }
    }

    public void incrementScore() {  // defines method to increment the player's score
        score++;
    }

    public String getName() {  // getter for name
        return name;
    }

    public int getScore() { // getter for score
        return score;
    }
}

