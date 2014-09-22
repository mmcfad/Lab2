//Lab2 - by Mark McFadden and Andrew Fromm

package mainPackage;


import java.util.Collections;
import java.util.ArrayList;

public class Deck {
	
	
	public Deck(){		
		
		ArrayList <Card> makingdeck = new ArrayList<Card>();
	
		for (int suit = 1; suit <= 4; suit++) {
			
			for (int rank = 0; rank <= 12; rank++){
				makingdeck.add(new Card(suit,rank));
			}
		}		
		Collections.shuffle(makingdeck);
		

		ArrayList hand1 = new ArrayList();
			for (int i = 0; i < 5; i++){
				hand1.add(makingdeck.indexOf(0));
				makingdeck.remove(0);
			}
		ArrayList hand2 = new ArrayList();
			for (int i = 0; i < 5; i++){
				hand2.add(makingdeck.indexOf(0));
				makingdeck.remove(0);
		
		int CardCount = makingdeck.size() - 1;
		
		Collections.sort(hand1);
		Collections.sort(hand2);
		
		public static (ArrayList hand){
			
			int Kicker = hand.getRank(4);
				
		if (hand.getSuit(0) == hand.getSuit(1) && hand.getSuit(1) == hand.getSuit(2) && hand.getSuit(2) == hand.getSuit(3) && hand.getSuit(3) == hand.getSuit(4)){
			boolean flush = true;
		}
		else{
			boolean flush = false;
		}
		
		if (hand.getRank(0) + 1 == hand.getRank(1) && hand.getRank(1) + 1 == hand.getRank(2) && hand.getRank(2) + 1 == hand.getRank(3) && hand.getRank(3) + 1 == hand.getRank(4)){
			boolean straight = true;
			
		}
		else{
			boolean straight = false;
		}
		if (straight == true){
			if (hand.getRank(0) == ACE && hand.getRank(4) == KING){
				boolean royal = true;
			}
		}
		else {
			boolean royal = false;
		}
		
		if (straight == true && flush == true){
			boolean straightFlush = true;
			Kicker = hand.getRank(4);
		}
		else{
			boolean straightFlush = false;
		}
		
		if (hand.getRank(0) == hand.getRank(3) || hand.getRank(1) == hand.getRank(4)){
			boolean fourOfaKind = true;
			if (hand.getRank(1) == hand.getRank(4)){
				int Kicker = hand.getRank(0);
			}
		}
		else{
			boolean fourOfaKind = false;
		}
		
		if (hand.getRank(0) == hand.getRank(2) && hand.getRank(3) == hand.getRank(4) && hand.getRank(3) != hand.getRank(2)){
			boolean fullHouse = true;
		}
		else{
			boolean fullHouse = false;
		}
		if (hand.getRank(2) == hand.getRank(4) && hand.getRank(0) == hand.getRank(1) && hand.getRank(1) != hand.getRank(2)){
			boolean fullHouse = true;
		}
		else{
			boolean fullHouse = false;
		}
		if (hand.getRank(0) == hand.getRank(2) || hand.getRank(1) == hand.getRank(3) || hand.getRank(2) == hand.getRank(4)){
			boolean threeOfaKind = true;
		}
		else{
			boolean threeOfaKind = false;
		}
		if (hand.getRank(0) == hand.getRank(1) && hand.getRank(2) == hand.getRank(3) || hand.getRank(0) == hand.getRank(1) && hand.getRank(3) == hand.getRank(4) || hand.getRank(1) == hand.getRank(2) && hand.getRank(3) == hand.getRank(4)){
			boolean twoPair = true;
		}
		else{
			boolean twoPair = false;
		}
		if (hand.getRank(0) == hand.getRank(1) || hand.getRank(1) == hand.getRank(2) || hand.getRank(2) == hand.getRank(3) || hand.getRank(3) == hand.getRank(4)){
			boolean pair = true;
		}
		else{
			boolean pair = false;
		}
		
		int Kicker = hand.getRank(4);
		
		if (royal == true && flush == true && straight == true){
			int handStrength = 100;
		}
		else if (flush == true && straight == true){
			int handStrength = 90;
		}
		else if (fourOfaKind == true){
			int handStrength = 80;
		}
		else if (fullHouse == true){
			int handStrength = 70;
		}
		else if (flush == true){
			int handStrength = 60;
		}
		else if (straight == true){
			int handStrength = 50;
		}
		else if (threeOfaKind == true){
			int handStrength = 40;
		}
		else if (twoPair == true){
			int handStrength = 30;
		}
		else if (pair == true){
			int handStrength = 20;
		}
		else{
			int handstrength = 10;
		}
		
		
		
		if (handStrength.hand1 > handStrength.hand2){
			System.out.println("Player 1 wins!");
		}
		else{
			System.out.println("Player 2 wins!");
		}
		
		
		
		
		
	}
		
	}
		
}
}
	
