package com.cards;

import java.util.ArrayList;
import java.util.List;

public class Deal {

	List<Object> handList = new ArrayList<Object>();

	public List<Object> dealCards(int playersCount) {

		Deck deck = new Deck();
		
		List<Card> shuffledcards = deck.shuffleDeck();

		if (playersCount > 0) {
			int eachCount = deck.getDeck().size() / playersCount;

			int start = 0;
			int end = eachCount;

			for (int counter = 0; counter < playersCount; counter++) {

				if (end <= shuffledcards.size()) {
					List<Card> hand = shuffledcards.subList(start, end);

					handList.add(hand);
				}

				start = end;
				end = end + eachCount;

			}
		} else {
			System.out.println("Number of Players shoud be greater than zero");
		}
		return handList;

	}

}
