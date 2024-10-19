package week06Assignment;

public class Card {
    private final int value;      // value of the cards: 2-14
    private final String name;     // name of the cards e.g. "Ace of Spades"

    
    public Card(int value, String name) { // constructor to create a card
        this.value = value;
        this.name = name;
    }

    public int getValue() {  // getter for value
        return value;
    }

   
    public String getName() {  // getter for name
        return name;
    }

    public void describe() {  // method to describe the card
        System.out.println(name);
    }
}
