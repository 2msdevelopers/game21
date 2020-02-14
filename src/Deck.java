import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList list = new ArrayList<E>();
	
	public Deck(ArrayList<Card> cards) {
		list = cards;
	}
	
	public void resetDeck() {
		
	}
	
	public void shuffleDeck() {
		Collections.shuffle(list);
	}
}
