public class Card {
	String suit;
	Integer number;
	
	public Card(Integer number, String suit) {
		this.suit = suit;
		this.number = number;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
