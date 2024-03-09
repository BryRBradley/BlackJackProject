package com.skilldistillery.blackjack.game;

import com.skilldistillery.blackjack.cards.Hand;

public class blackJackHand extends Hand {

	public int getHandValue() {
// How super.cardInHand.get(0).getvalue(); but it has to be different.
	}

	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			System.out.println("BlackJack");
			return true;
		} else {
			return false;
		}
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			System.out.println("Busted");
			return true;
		} else {
			return false;
		}

	}

	public int getDealerHandValue() {
		return super.cardsInHand.get(0).getValue();

	}

}
