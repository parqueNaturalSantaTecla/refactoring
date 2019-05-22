package interval.v16;

class FromIncludedEndPoint extends FromEndPoint {

	FromIncludedEndPoint(double value) {
		super(value);
		this.mode = new Closed();
	}
	
}
