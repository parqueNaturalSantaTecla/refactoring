package interval.v10;

class UntilIncludedEndPoint extends UntilEndPoint {

	UntilIncludedEndPoint(double value, boolean closed) {
		super(value, closed);
	}

	boolean onRight(double value) {
		return super.onRight(value) ||value == this.getValue();
	}

}
