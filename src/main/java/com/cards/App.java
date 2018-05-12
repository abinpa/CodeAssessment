package com.cards;

import java.util.List;

public class App {
	public static void main(String[] args) {
		
		Deal deal = new Deal();
		List<Object> hands = deal.dealCards(4);
		List<Card> cardlist ;
		int counter = 0;
		for(Object obj : hands)
		{
			cardlist = (List<Card>)obj ;
			
			System.out.println("Set => "+(++counter));
			for(Card card : cardlist)
			{
				System.out.print(card.suit()+" "+card.rank()+" , ");
			}
			System.out.println();
		}

	}
}
