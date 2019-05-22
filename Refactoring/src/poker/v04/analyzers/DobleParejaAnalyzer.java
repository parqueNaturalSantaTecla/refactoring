package poker.v04.analyzers;

import java.util.List;

import poker.v04.Gamble;
import poker.v04.GambleType;
import poker.v04.PlayerStatistics;
import poker.v04.Value;

public class DobleParejaAnalyzer { 

	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasTwoPairs()) {
			List<Value> orderedValues = playerStatistics.getOrderedValues(2);
			orderedValues.addAll(playerStatistics.getOrderedValues(1));
			return new Gamble(GambleType.DOBLE_PAREJA, orderedValues);
		} 
		return null;
	}

}
