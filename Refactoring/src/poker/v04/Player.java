package poker.v04;

import java.util.ArrayList;
import java.util.List;

import poker.v04.analyzers.CartaAltaAnalyzer;
import poker.v04.analyzers.DobleParejaAnalyzer;
import poker.v04.analyzers.ParejaAnalyzer;

public class Player {

	private List<Card> cardList;

	private Gamble gamble;

	public Player() {
		cardList = new ArrayList<Card>();
	}

	public void add(Card card) {
		cardList.add(card);
	}

	public Player whoIsWinner(Player player) {
		assert player != null;
		Gamble winner = this.getGamble().whoIsWinner(player.getGamble());
		if (winner == this.getGamble()) {
			return this;
		} else if (winner == player.getGamble()) {
			return player;
		} else {
			return null;
		}
	}

	private Gamble getGamble() {
		PlayerStatistics playerStatistics = new PlayerStatistics(cardList);
		if (gamble == null) {
			gamble = new DobleParejaAnalyzer().getGamble(playerStatistics);
			if (gamble == null) {
				gamble = new ParejaAnalyzer().getGamble(playerStatistics);
				if (gamble == null) {
					gamble = new CartaAltaAnalyzer().getGamble(playerStatistics);
				}
			}
		}
		return gamble;
	}

	@Override
	public String toString() {
		return "Player [\ncardList=" + cardList + ", \ngamble=" + gamble + "]";
	}

}
