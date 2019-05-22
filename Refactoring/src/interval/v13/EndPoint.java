package interval.v13;

class EndPoint {

	private double value;
	
	protected EndPoint(double value) {
		super();
		this.setValue(value);
	}
	
	void shift(double value) {
		this.setValue(this.getValue() + value);
	}

	double getValue() {
		return value;
	}

	private void setValue(double value) {
		this.value = value;
	}
	
}
