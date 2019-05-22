package poker.v05.analyzers;

import java.util.List;

import poker.v05.Gamble;
import poker.v05.GambleType;
import poker.v05.PlayerStatistics;
import poker.v05.Value;

class ParejaAnalyzer {
	
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasSameValue(2)) {
			List<Value> orderedValues = playerStatistics.getOrderedValues(2);
			orderedValues.addAll(playerStatistics.getOrderedValues(1));
			return new Gamble(GambleType.PAREJA, orderedValues);
		}
		return null;
	}


}
