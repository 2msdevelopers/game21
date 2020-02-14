import java.util.ArrayList;

public class Game {
	public static void main(String args[]) {
		String suitSpade = "Spade";
		String suitClubs = "Clubs";
		String suitsHearts = "Hearts";
		String suitsDiamonds = "Diamonds";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(suitSpade);
		list.add(suitsHearts);
		list.add(suitsDiamonds);
		list.add(suitClubs);
		ArrayList deckList = new ArrayList();
		int cardNumber = 1;
		int counter = 0;
		int suitName = 0;
		for(int i = 1; i <=53; i++) {
			Card card = new Card(cardNumber, list.get(suitName));
			cardNumber++;
			if(i%13 == 0) {
				suitName++;
				cardNumber = 1;
			}
			deckList.add(card);
		}
		Deck deck = new Deck(deckList);
	}
}
