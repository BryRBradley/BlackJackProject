package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> Cards;

	public Deck() {

		setCards(createDeck());
	}

	private List<Card> createDeck() {
		// TODO Auto-generated method stub
		List<Card> deck = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(rank, suit));
			}
		}
		return deck;
	}

	public List<Card> getCards() {
		return Cards;
	}

	public int checkDeckSize() {
		return Cards.size();
	}

	public void shuffle() {
		Collections.shuffle(Cards);
	}

	public Card dealCard() {
		return Cards.remove(0);

	}

	public void dealCard(Hand hand) {
		hand.addCard(dealCard());
	}

	public void setCards(List<Card> cards) {
		Cards = cards;
	}

}
