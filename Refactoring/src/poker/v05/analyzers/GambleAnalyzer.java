package poker.v05.analyzers;

import poker.v05.Gamble;
import poker.v05.PlayerStatistics;

public class GambleAnalyzer {

	private DobleParejaAnalyzer dobleParejaAnalyzer;

	private ParejaAnalyzer parejaAnalyzer;
	
	private CartaAltaAnalyzer cartaAltaAnalyzer;
	
	public GambleAnalyzer() {
		dobleParejaAnalyzer = new DobleParejaAnalyzer();
		parejaAnalyzer = new ParejaAnalyzer();
		cartaAltaAnalyzer = new CartaAltaAnalyzer();
	}

	public Gamble getGamble(PlayerStatistics playerStatistics) {
		Gamble gamble;
		gamble = dobleParejaAnalyzer.getGamble(playerStatistics);
		if (gamble != null) {
			return gamble;
		}
		gamble = parejaAnalyzer.getGamble(playerStatistics);
		if (gamble != null) {
			return gamble;
		}
		return cartaAltaAnalyzer.getGamble(playerStatistics);
	}

}