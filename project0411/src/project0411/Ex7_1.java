package project0411;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			if (i + 1 == 1 || i + 1 == 3 || i + 1 == 8)
				cards[i] = new SutdaCard(i + 1, true);
			else
				cards[i] = new SutdaCard(i % 10 + 1, false);
		}
	}
	
	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int index = (int)(Math.random()*cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[index];
			cards[index] = tmp;
		}
	}
	
	public SutdaCard pick(int i) {
		if(i<0 || i>=CARD_NUM) return null;
		return cards[i];
	}
	public SutdaCard pick() {
		return cards[(int)(Math.random()*cards.length)];
	}
	
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_1 {
	public static void main(String args[]) {
		 SutdaDeck deck=new SutdaDeck();
		 
		 for(int i=0; i<deck.cards.length;i++)
		 System.out.print(deck.cards[i]+",");
		 }
	}
