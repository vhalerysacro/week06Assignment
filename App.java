package week06Assignment;


public class App {
	public static void main(String[] args) {
	  Deck deck = new Deck(); // instantiates the deck
	  Player player1 = new Player("Elphaba"); // creates Player 1
      Player player2 = new Player("Glinda"); // creates Player 2
	      
      System.out.println("Game of WAR"); // title of game 
      System.out.println("-----------------");
	      
		// draws cards for both players
      for (int i = 0; i < 52; i++) { // runs 52 times == 52 cards
	          player1.draw(deck); // draws card from deck each iteration of the loop
	          player2.draw(deck); // draws card from deck each iteration of the loop
		    }
	      	
		//plays 26 rounds
	  for (int i = 0; i < 26; i++) {
		    Card card1 = player1.flip(); // flip method that removes and returns the top of the card from player's hand
            Card card2 = player2.flip();
            System.out.println("\nRound " + (i + 1) + ":"); //prints round 1-26
            System.out.println(player1.getName() + " draws...");
	        card1.describe(); // describe method that prints card drawn using flip method
	        System.out.println(player2.getName() + " draws...");
	        card2.describe();
		        
		  // compares card values using increment and updates the scores
         if (card1.getValue() > card2.getValue()) {
		        player1.incrementScore();
	            System.out.println(player1.getName() + " wins the round!\n");
	     } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round!\n");
          } else {
		        System.out.println("Darns! It's a tie! \nNo points awarded.\n");
	        }

		        // prints the scores per round
		        System.out.println(player1.getName() + "'s Score: " + player1.getScore());
		        System.out.println(player2.getName() + "'s Score: " + player2.getScore());
                System.out.println("\n-----------------");
		      }

		        // determines the overall winner of the game and prints name with scores
		        System.out.println("\nFinal Scores:");
		        System.out.println(player1.getName() + ": " + player1.getScore());
		        System.out.println(player2.getName() + ": " + player2.getScore());

		   // compares the scores of the players to determine the winner and prints
		  if (player1.getScore() > player2.getScore()) { 
		        System.out.println(player1.getName() + " wins the game!!!");
		     } else if (player1.getScore() < player2.getScore()) {
	            System.out.println(player2.getName() + " wins the game!!!");
		     } else {
	            System.out.println("Mwahahaha..it's a draw!");
		     }
	}
}
	
	
	
