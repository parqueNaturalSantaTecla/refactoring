package poker.v03.test;

import poker.v03.Card;
import poker.v03.Deck;
import poker.v03.Suite;
import poker.v03.Value;

public class TestDeck extends Deck {

	public Card getCard(Value value) {
		Card result = null;
		for (Card card : cardList) {
			if (card.getValue().equals(value)) {
				result = card;
			}
		}
		if (result != null) {
			cardList.remove(result);
		}
		return result;
	}

	public Card getCard(Suite suite) {
		Card result = null;
		for (Card card : cardList) {
			if (card.getSuite().equals(suite)) {
				result = card;
			}
		}
		if (result != null) {
			cardList.remove(result);
		}
		return result;
	}

	public Card getCard(Value value, Suite suite) {
		Card result = null;
		for (Card card : cardList) {
			if (card.getValue().equals(value) && card.getSuite().equals(suite)) {
				result = card;
			}
		}
		if (result != null) {
			cardList.remove(result);
		}
		return result;
	}
}
