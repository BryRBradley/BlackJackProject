package com.skilldistillery.blackjack.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.game.blackJackHand;

public class BlackJackApp {

	Scanner kb = new Scanner(System.in);
	boolean gameRunning;
	blackJackHand user;
	blackJackHand dealer;
// initiate the deck, deal cards to player and dealer
//	p=2c both up d=1up 1down. p chooses to hit or stay till stay. if(player busts = loose) 
// dealer displays card two and plays until at least = 17.
// if scores equal then tie.
// continue play until user types quit.
// Stretch*** track wins with counter
// deck number 
// DicardDeck ;

//************** BLackJackApp run method block 
	private void run() {
		gameRunning = true;
		System.out.println("Welcome Player we are going to play some black jack!!! \n");
		System.out.println("Would you like to see the rules? Y/N");

		String rulesChoice = kb.nextLine();

		try {
			if (rulesChoice.equalsIgnoreCase("Y")) {
				displayRules();
				startGame();
			}
			if (rulesChoice.equalsIgnoreCase("N")) {
				startGame();
			}
		} catch (InputMismatchException e) {
			System.out.println("Not a valid number of cards use only whole numbers.");
		} finally {
			kb.close();
		}
	}

	private void startGame() {
		int roundCount = 1;

		while (gameRunning) {
			Deck deck = new Deck();
// ???????? why do you write it this way?
			deck.shuffle();
			System.out.println("Round  " + roundCount);
			dealCards();

			System.out.println("Do you want to play another round Y/N ?\n");
			String userQuit = kb.nextLine();
			if (userQuit.equalsIgnoreCase("N")) {
				gameRunning = false;
				System.out.println("Oh good I thought you were getting addicted GOODBYE");
			}
			if (userQuit.equalsIgnoreCase("Y")) {
				gameRunning = true;
				roundCount = roundCount + 1;
				System.out.println("Lets deal the cards\n");
			}
// ************ while loop end ************			
		}
	}

	private void dealCards() {

	}

	private void displayRules() {
		System.out.println(
				"\nBlackjack is an incredibly popular, exciting and easy card game to play. \nThe object is to have a hand with a total value higher than the dealer’s without going over 21. \nKings, Queens, Jacks and Tens are worth a value of 10. An Ace has the value of 1 or 11. \nThe remaining cards are counted at face value.");
		System.out.println("\n*********************************HOW TO PLAY**************************************\n"
				+ "\nYou are dealt two cards, whilst the dealer is dealt one face up. \nIf your first 2 cards add up to 21 (an Ace and a card valued 10), that’s Blackjack! \nIf they have any other total, decide whether you wish to ‘draw’ or ‘stay’. \nYou can continue to draw cards until you are happy with your hand.");
		System.out.println(
				"\nOnce you have taken your turn the dealer draws another card for their hand. \nThey must draw until they reach 17 or more.");
		System.out.println(
				"Once all cards are drawn, whoever has a total closer to 21 wins. \nIf player’s hand and dealer’s hand have an equal value, it’s a tie.");
		System.out.println("\nThen the process starts again. Lets get playing!\n");
	}

//  ************** MAIN *******************
	public static void main(String[] args) {
		BlackJackApp game = new BlackJackApp();
		game.run();
	}

}