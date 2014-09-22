//Lab2 - by Mark McFadden and Andrew Fromm

package mainPackage;

import java.util.ArrayList;

public class Card {
	public enum ESuit{
		HEART, DIAMOND, CLUB, SPADE
	}
	public enum ERank{
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	private int rank;
	private int suit;
	


    Card(int suit, int rank)
    {
        this.rank=rank;
        this.suit=suit;
    }

   

    public int getRank() {
         return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }
			
		
	}
		
 
