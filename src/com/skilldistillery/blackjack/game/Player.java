
package com.skilldistillery.blackjack.game;

import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Card;

public class Player {
	protected BlackJackHand handOfCards = new BlackJackHand();

	@Override
	public String toString() {
		return "Player [playerHand=" + getHandOfCards() + "]";
	}

	public void hitOrStay(Dealer dealer, Scanner kb) {
		boolean isRunning = true;
		// System.out.println("In player hit or stay");
		while (isRunning) {
			System.out.println("\nDo you want to hit or stay? H/S");
			String hitMe = kb.nextLine();
			if (hitMe.equalsIgnoreCase("H")) {
				this.addCard(dealer.dealCard());
				System.out.println("\nYour cards: " + this.toString() + " and equal: " + this.getHandValue());
			} else if (hitMe.equalsIgnoreCase("S")) {
				System.out.println("\nYour cards: " + this.toString() + " and equal: " + this.getHandValue());
				isRunning = false;
			}
			if (this.getHandValue() > 21) {
				System.out.println("\nYou busted playa\n' ");
				System.out.println("\nYour cards: " + this.toString() + " and equal: " + this.getHandValue());
				isRunning = false;
			}
		}
	}

// player logic hit or stay 
	// clear player's hand
	public void clearHand() {
		this.handOfCards.clear();
	}

	public void addCard(Card dealtCard) {
// add dealt card to player hand
		getHandOfCards().addCard(dealtCard);

	}

	public int getHandValue() {
		return getHandOfCards().getHandValue();

	}

	public void setHandOfCards(BlackJackHand handOfCards) {
		this.handOfCards = handOfCards;
	}

	public BlackJackHand getHandOfCards() {
		return handOfCards;
	}

}