package poker.v06.builders;

import java.util.Random;

import poker.v06.Player;
import poker.v06.Suite;
import poker.v06.Value;
import poker.v06.test.TestDeck;

public abstract class GambleBuilder {

	protected TestDeck deck;

	protected Player player;
	
	private Random random;
	
	protected GambleBuilder() {
		this.random = new Random(System.currentTimeMillis());
	}
	
	protected Value valueRandom() {
		return Value.values()[this.random.nextInt(Value.values().length)];
	}
	
	protected Suite suiteRandom() {
		return Suite.values()[this.random.nextInt(Suite.values().length)];
	}

	public Player build() {
		deck = new TestDeck();
		player = new Player();
		this.fillPlayer();
		return player;
	}

	abstract protected void fillPlayer();
	
}
