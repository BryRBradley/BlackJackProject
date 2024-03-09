package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cardsInHand = new ArrayList<>();

	public void addCard(Card card) {
		cardsInHand.add(card);
	}

	public abstract int getHandValue();

	public String showDealerCard() {
		String dealersSecondCard = "Dealers Second Card" + cardsInHand.get(0).toString();
		return dealersSecondCard;
	}

	@Override
	public String toString() {
		return "Hand [cardsInHand=" + cardsInHand + "]";
	}
}
