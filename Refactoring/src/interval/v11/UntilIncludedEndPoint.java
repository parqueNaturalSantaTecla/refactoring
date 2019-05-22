package interval.v11;

class UntilIncludedEndPoint extends UntilEndPoint {

	UntilIncludedEndPoint(double value, boolean closed) {
		super(value, closed);
	}

	boolean onRight(double value) {
		return super.onRight(value) || value == this.getValue();
	}
	
	boolean onRight(UntilEndPoint that) {
		return this.getValue() >= that.getValue();
	}

}
