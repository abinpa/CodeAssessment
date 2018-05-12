package com.cards;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	
//To Verify total 52 cards available
	@Test
	public void checkTotalCards()
	{
		Deck deck = new Deck();
		Assert.assertTrue("Failed : 52 cards are not present in the deck", 52 == deck.getDeck().size());

	}
//To Verify no remaining cards when divided among 4 players	
	@Test
	public void noCardBalanceAfterDividingCheck()
	{
		Deal deal = new Deal();
		Deck deck = new Deck();
		List<Object> hands = deal.dealCards(4);
		List<Card> cardlist;
		int cardsCount = 0;
		for (Object obj : hands) {
			cardlist = (List<Card>) obj;
			cardsCount += cardlist.size();
		}

		Assert.assertTrue("Failed : Remaining cards after grouping", cardsCount == deck.getDeck().size());

	}
	
// To Verify some cards are remaining when divide among 5 players
	@Test
	public void CardBalanceAfterDividingCheck()
	{
		Deal deal = new Deal();
		Deck deck = new Deck();
		List<Object> hands = deal.dealCards(5);
		List<Card> cardlist;
		int cardsCount = 0;
		for (Object obj : hands) {
			cardlist = (List<Card>) obj;
			cardsCount += cardlist.size();
		}

		Assert.assertTrue("Failed : No remaining cards after grouping", cardsCount < deck.getDeck().size());

	}
	

	

}
