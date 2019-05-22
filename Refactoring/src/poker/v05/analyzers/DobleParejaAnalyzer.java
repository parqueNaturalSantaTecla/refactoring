package poker.v05.analyzers;

import java.util.List;

import poker.v05.Gamble;
import poker.v05.GambleType;
import poker.v05.PlayerStatistics;
import poker.v05.Value;

class DobleParejaAnalyzer { 


	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasTwoPairs()) {
			List<Value> orderedValues = playerStatistics.getOrderedValues(2);
			orderedValues.addAll(playerStatistics.getOrderedValues(1));
			return new Gamble(GambleType.DOBLE_PAREJA, orderedValues);
		} 
		return null;
	}

}
