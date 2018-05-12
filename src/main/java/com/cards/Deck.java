package com.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cards.Card.Rank;
import com.cards.Card.Suit;

public class Deck {

	List<Card> cards = new ArrayList<Card>();

	public Deck() {
		cards = loadDeck();
	}

	public List<Card> getDeck() {
		return cards;
	}

	public List<Card> loadDeck() {
		List<Card> cards = new ArrayList<Card>();
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				cards.add(new Card(rank, suit));

		return cards;
	}

	public List<Card> shuffleDeck() {
		Collections.shuffle(cards);

		return cards;
	}

}
