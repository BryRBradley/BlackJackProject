package com.skilldistillery.blackjack.testing;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;

public class Deal {
	public static void main(String[] args) {

		Deal d = new Deal();
		d.run();
	}

	private void run() {
		System.out.println("We are playing black jack!!! \n");
		Deck deck = new Deck();
		Scanner kb = new Scanner(System.in);
		System.out.println("How many cards would you like 1 to 52?");

		try {
			int hitNum = kb.nextInt();
			if (hitNum > 52) {
				throw new InputMismatchException();
			}

			List<Card> hand = new ArrayList<>(hitNum);
			int totalValue = 0;
			for (int i = 0; i < hitNum; i++) {
				Card cardInHand = deck.dealCard();
				totalValue += cardInHand.getValue();
				hand.add(cardInHand);
				return;
			}
			printHandAndValue(hand, totalValue);
		} catch (InputMismatchException e) {
			System.out.println("Not a valid number of cards use only whole numbers.");
		} finally {
			kb.close();
		}
	}

	private void printHandAndValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Total value: " + value);
	}
}
