package zaffora;

import java.util.*;

public class Main {
    static List<Pokemon> cardsDeck = new ArrayList<>();
    static NodeStack<Pokemon> cardStack = new NodeStack<>();
    static NodeStack<Pokemon> p1cards = new NodeStack<>();
    static NodeStack<Pokemon> p2cards = new NodeStack<>();
    static NodeStack<Pokemon> p1cardsWon = new NodeStack<>();
    static NodeStack<Pokemon> p2cardsWon = new NodeStack<>();

    static PokedexDriverCSV pokeDeck = new PokedexDriverCSV();

    public static void main(String[] args) {
       // initializeCards();
        shuffleCards();
        initializeCardStack();

        // Displays shuffled full deck of cards
        System.out.println("Original shuffled deck of cards: ");
        displayDeck();



        System.out.println("\n\nDealing 10 cards to player 1 and player 2: ");
        dealCards();


        System.out.println("\nPlayer 1 now has " + p1cards.size() + " cards.");
        System.out.println("Player 1 cards are: ");
        System.out.println(p1cards);


        System.out.println("Player 2 now has " + p2cards.size() + " cards.");
        System.out.println("Player 2 cards are: ");
        System.out.println(p2cards);

        for(int hand=0; hand < 10; hand++){
            int p1Hand, p2Hand;

            System.out.println("Hand " + (hand + 1) + ":");
            p1Hand = p1cards.top().getTotal();
            p2Hand = p2cards.top().getTotal();

            System.out.println("Player 1 has: " + p1Hand);
            System.out.println("Player 2 has: " + p2Hand);

            if (p1Hand > p2Hand){
                p1cardsWon.push(p1cards.pop());
                p1cardsWon.push(p2cards.pop());
                System.out.println("Player 1 has won this hand.");
            }
            if (p1Hand < p2Hand){
                p2cardsWon.push(p1cards.pop());
                p2cardsWon.push(p2cards.pop());
                System.out.println("Player 2 has won this hand.");
            }

        }

        if(p1cardsWon.size() > p2cardsWon.size()){
            System.out.println("\nPlayer 1 Wins!");
        }
        if(p1cardsWon.size() < p2cardsWon.size()){
            System.out.println("\nPlayer 2 Won!");
        }

    }

/*
    static void initializeCards() {
        // Deck of cards is filled with integers 0 through 51
        for (int i= 0; i<52 ; i++) {
            cardsDeck.add();
        }
    }

 */

    static void shuffleCards() {
        // Shuffle the ArrayList holding the initial deck of cards
        Collections.shuffle(cardsDeck);
    }

    static void displayDeck() {
        // Simple method to display all items in deck of cards
        for (Pokemon card: cardsDeck) {
            System.out.print(card.getName() + ":" + card.getTotal() + " ");
        }
    }

    static void initializeCardStack() {
        cardsDeck = pokeDeck.readDeck();

        // The inital ArrayList was used to facilitate shuffling, now we use the Stack ADT to implement the rest of our game
        for (int i= 0; i<20; i++) {
            cardStack.push(cardsDeck.get(i));
        }
    }

    static void dealCards() {
        // Deal cards to each player
        for (int i= 0; i<20; i++) {
            if (i%2 == 0) {
                p1cards.push(cardStack.pop());
            } else {
                p2cards.push(cardStack.pop());
            }
        }
    }

}
