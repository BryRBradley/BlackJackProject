package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cardsInHand = new ArrayList<>();

	public void addCard(Card card) {
		cardsInHand.add(card);
	}

////	public void clearHand(List<Card> cardsInHand) {
//		ArrayList arrayList = new ArrayList();
//		// cardsInHand.removeAll(cardsInHand);
//		arrayList.clear();
//	}

//	public void removeAllCard(Card card) {
//		cardsInHand.removeAll((Collection<?>) card);
//	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cardsInHand=" + cardsInHand + "]";
	}

}
