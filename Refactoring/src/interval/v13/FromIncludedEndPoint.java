package interval.v13;

class FromIncludedEndPoint extends FromEndPoint {

	FromIncludedEndPoint(double value) {
		super(value);
	}

	boolean onLeft(double value) {
		return super.onLeft(value) || this.getValue() == value;
	}

	boolean onLeft(FromEndPoint that) {
		return this.getValue() <= that.getValue();
	}
}
