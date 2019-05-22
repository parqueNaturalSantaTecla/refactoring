package poker.v06.analyzers;

import poker.v06.Gamble;
import poker.v06.GambleType;
import poker.v06.PlayerStatistics;

class CartaAltaAnalyzer extends Analyzer {
	
	public CartaAltaAnalyzer(){
		this(null);
	}
	
	public CartaAltaAnalyzer(Analyzer analyzer){
		super(analyzer);
	}
	
	@Override
	public Gamble getGamble(PlayerStatistics playerStatistics) {
		return new Gamble(GambleType.CARTA_ALTA, playerStatistics.getOrderedValues(1));
	}

}
