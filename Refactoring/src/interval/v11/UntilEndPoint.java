package interval.v11;

class UntilEndPoint extends EndPoint {

	UntilEndPoint(double value, boolean closed) {
		super(value, closed);
	}

	boolean onRight(double value) {
		return value < this.getValue();
	}

	boolean onRight(UntilEndPoint that) {
		if (this.getValue() < that.getValue()) {
			return false;
		}
		if (this.getValue() == that.getValue() && that.isClosed()) {
			return false;
		}
		return true;
	}

}
