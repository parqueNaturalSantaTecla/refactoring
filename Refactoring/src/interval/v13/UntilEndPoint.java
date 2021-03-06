package interval.v13;

class UntilEndPoint extends EndPoint {

	UntilEndPoint(double value) {
		super(value);
	}

	boolean onRight(double value) {
		return value < this.getValue();
	}

	boolean onRight(UntilEndPoint that) {
		if (this.onRight(that.getValue())) {
			return true;
		}
		if (this.getValue() == that.getValue()) {
			return new OnRightChecker(that).onRight();
		}
		return false;
	}

}
