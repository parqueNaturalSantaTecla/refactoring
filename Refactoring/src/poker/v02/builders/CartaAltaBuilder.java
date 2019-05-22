package poker.v02.builders;

import poker.v02.Card;
import poker.v02.Value;

public class CartaAltaBuilder extends GambleBuilder {

	private Value minValue;
	
	public CartaAltaBuilder setMinValue(Value minValue) {
		this.minValue = minValue;
		return this;
	}
	
	@Override
	public void fillPlayer() {
		Card card = deck.getCard(minValue);
		player.add(card);
		player.add(deck.getCard(minValue.next(1), card.getSuite().next(1)));
		player.add(deck.getCard(minValue.next(2)));
		player.add(deck.getCard(minValue.next(3)));
		player.add(deck.getCard(minValue.next(5)));
	}

}
