package zaffora;

/**
 * @author Jin An
 * Delaware Technical Community College
 * Assignment 4 Starter Code for Card Game using Stack ADT
 */

import java.util.*;

public class Main {
    static ArrayList<Integer> cardsDeck = new ArrayList<>();
    static NodeStack<Integer> cardStack = new NodeStack<>();
    static NodeStack<Integer> p1cards = new NodeStack<>();
    static NodeStack<Integer> p2cards = new NodeStack<>();
    static NodeStack<Integer> p1cardsWon = new NodeStack<>();
    static NodeStack<Integer> p2cardsWon = new NodeStack<>();

    public static void main(String[] args) {
        initializeCards();
        shuffleCards();

        // Displays shuffled full deck of cards
        System.out.println("Original shuffled deck of cards: ");
        displayDeck();

        initializeCardStack();

        System.out.println("\n\nDealing 26 cards to player 1 and player 2: ");
        dealCards();


        System.out.println("\nPlayer 1 now has " + p1cards.size() + " cards.");
        System.out.println("Player 1 cards are: ");
        System.out.println(p1cards);


        System.out.println("Player 2 now has " + p2cards.size() + " cards.");
        System.out.println("Player 2 cards are: ");
        System.out.println(p2cards);

        // TODO: Game play logic:
        // TODO: As game progresses, the p1cards and p2cards stacks should get smaller
        // TODO: As game progresses, the p1cardsWon and p2CardsWon should get bigger, depending on who wins each round
        // TODO: When the game is over, display who won the game; in other words, is p1cardsWon or p2cardsWon bigger?

        for(int hand=0; hand < 26; hand++){
            int p1Hand, p2Hand;

            System.out.println("Hand " + hand + ":");
            p1Hand = (int) p1cards.top();
            p2Hand = (int) p2cards.top();

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
            System.out.println("Player 1 Wins!");
        }
        if(p1cardsWon.size() < p2cardsWon.size()){
            System.out.println("Player 2 Won!");
        }
    }

    static void initializeCards() {
        // Deck of cards is filled with integers 0 through 51
        for (int i= 0; i<52; i++) {
            cardsDeck.add(i);
        }
    }

    static void shuffleCards() {
        // Shuffle the ArrayList holding the initial deck of cards
        Collections.shuffle(cardsDeck);
    }

    static void displayDeck() {
        // Simple method to display all items in deck of cards
        for (int card: cardsDeck) {
            System.out.print(card + " ");
        }
    }

    static void initializeCardStack() {
        // The inital ArrayList was used to facilitate shuffling, now we use the Stack ADT to implement the rest of our game
        for (int i= 0; i<52; i++) {
            cardStack.push(cardsDeck.get(i));
        }
    }

    static void dealCards() {
        // Deal cards to each player
        for (int i= 0; i<52; i++) {
            if (i%2 == 0) {
                p1cards.push(cardStack.pop());
            } else {
                p2cards.push(cardStack.pop());
            }
        }
    }

}
