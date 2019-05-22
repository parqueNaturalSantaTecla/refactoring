package poker.v02.builders;

import poker.v02.Card;
import poker.v02.Value;

public class ParejaBuilder extends GambleBuilder {

	private Value valuePareja;
	
	private Value minValue;
	
	public ParejaBuilder setValuePareja(Value valuePareja) {
		this.valuePareja = valuePareja;
		return this;
	}
	
	public ParejaBuilder setMinValue(Value minValue) {
		this.minValue = minValue;
		return this;
	}
	
	@Override
	protected void fillPlayer() {
		Card card = deck.getCard(valuePareja);
		player.add(card);
		player.add(deck.getCard(valuePareja));
		player.add(deck.getCard(minValue, card.getSuite().next(1)));
		player.add(deck.getCard(minValue.next(1)));
		player.add(deck.getCard(minValue.next(2)));
	}
}
