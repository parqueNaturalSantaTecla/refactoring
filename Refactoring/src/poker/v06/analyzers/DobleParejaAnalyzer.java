package poker.v06.analyzers;

import java.util.List;

import poker.v06.Gamble;
import poker.v06.GambleType;
import poker.v06.PlayerStatistics;
import poker.v06.Value;

class DobleParejaAnalyzer extends Analyzer {

	public DobleParejaAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		if (playerStatistics.hasTwoPairs()) {
			List<Value> orderedValues = playerStatistics.getOrderedValues(2);
			orderedValues.addAll(playerStatistics.getOrderedValues(1));
			return new Gamble(GambleType.DOBLE_PAREJA, orderedValues);
		} else {
			return nextAnalyzer.getGamble(playerStatistics);
		}
	}

}
