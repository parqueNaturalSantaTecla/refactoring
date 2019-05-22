package poker.v04.analyzers;

import java.util.List;

import poker.v04.Gamble;
import poker.v04.GambleType;
import poker.v04.PlayerStatistics;
import poker.v04.Value;

public class ParejaAnalyzer {
	
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasSameValue(2)) {
			List<Value> orderedValues = playerStatistics.getOrderedValues(2);
			orderedValues.addAll(playerStatistics.getOrderedValues(1));
			return new Gamble(GambleType.PAREJA, orderedValues);
		}
		return null;
	}


}
