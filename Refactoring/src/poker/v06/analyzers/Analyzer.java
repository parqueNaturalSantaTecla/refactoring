package poker.v06.analyzers;

import poker.v06.Gamble;
import poker.v06.PlayerStatistics;

abstract class Analyzer {

	protected Analyzer nextAnalyzer;
	
	public Analyzer(Analyzer nextAnalyzer) {
		this.nextAnalyzer = nextAnalyzer;
	}

	public abstract Gamble getGamble(PlayerStatistics playerStatistics);


}
