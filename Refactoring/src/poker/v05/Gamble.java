package poker.v05;

import java.util.List;

public class Gamble {

	protected GambleType gambleType;
	
	private List<Value> orderedValues;

	public Gamble(GambleType gambleType, List<Value> orderedValues) {
		this.gambleType = gambleType;
		this.orderedValues = orderedValues;
	}

	public Gamble whoIsWinner(Gamble gamble) {
		Gamble winner = null;
		if (this.gambleType.equals(gamble.gambleType)) {
			winner = this.whoIsWinnerWithSameGambleType(gamble);
		} else if (this.gambleType.greater(gamble.gambleType)) {
			winner = this;
		} else {
			winner = gamble;
		}
		return winner;
	}

	private Gamble whoIsWinnerWithSameGambleType(Gamble gamble) {
		List<Value> orderedValues = gamble.orderedValues;
		int i = 0;
		while (i < orderedValues.size() - 1
				&& this.orderedValues.get(i).equals(orderedValues.get(i))) {
			i++;
		}
		if (this.orderedValues.get(i).greater(orderedValues.get(i))) {
			return this;
		} else if (orderedValues.get(i).greater(this.orderedValues.get(i))) {
			return gamble;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Gamble [gambleType=" + gambleType.name() + ", orderedValues="
				+ orderedValues + "]";
	}

}
