package interval.v13;

class FromEndPoint extends EndPoint {

	FromEndPoint(double value) {
		super(value);
	}

	boolean onLeft(double value) {
		return this.getValue() < value;
	}

	boolean onLeft(FromEndPoint that) {
		if (this.onLeft(that.getValue())) {
			return true;
		}
		if (this.getValue() == that.getValue()) {
			return new OnLeftChecker(that).onLeft();
		}
		return false;
	}

}
