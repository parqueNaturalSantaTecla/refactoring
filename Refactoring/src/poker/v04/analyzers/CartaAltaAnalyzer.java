package poker.v04.analyzers;

import poker.v04.Gamble;
import poker.v04.GambleType;
import poker.v04.PlayerStatistics;

public class CartaAltaAnalyzer { 
	
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		return new Gamble(GambleType.CARTA_ALTA, playerStatistics.getOrderedValues(1));
	}

}
