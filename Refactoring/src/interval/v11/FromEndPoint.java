package interval.v11;

class FromEndPoint extends EndPoint {

	FromEndPoint(double value, boolean closed) {
		super(value, closed);
	}

	boolean onLeft(double value) {
		return this.getValue() < value;
	}

	boolean onLeft(FromEndPoint that) {
		if (this.getValue() > that.getValue()) {
			return false;
		}
		if (this.getValue() == that.getValue() && that.isClosed()) {
			return false;
		}
		return true;
	}

}
