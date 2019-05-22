package interval.v21;

public interface From {

	boolean onLeft(From that);
	
	void shift(double value);
	
	double getValue();
	
	double distance(UntilEndPoint untilEndPoint);
	
	Mode getMode();
}
