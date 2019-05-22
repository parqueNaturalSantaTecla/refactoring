package poker.v05.analyzers;

import poker.v05.Gamble;
import poker.v05.GambleType;
import poker.v05.PlayerStatistics;

class CartaAltaAnalyzer { 
	
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		return new Gamble(GambleType.CARTA_ALTA, playerStatistics.getOrderedValues(1));
	}

}
