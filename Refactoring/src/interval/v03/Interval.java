package interval.v03;

public class Interval {

	private FromEndPoint fromEndPoint; 
	
	private UntilEndPoint untilEndPoint;

	public Interval(double minimum, boolean minimumClosed, double maximum, boolean maximumClosed) {
		assert minimum < maximum || minimum == maximum && minimumClosed || !minimumClosed;
		this.fromEndPoint = new FromEndPoint(minimum, minimumClosed);
		this.untilEndPoint = new UntilEndPoint(maximum, maximumClosed);
	}

	public void shift(double value) {
		this.fromEndPoint.value += value;
		this.untilEndPoint.value += value;
	}

	public double length() {
		return this.untilEndPoint.value - this.fromEndPoint.value;
	}

	public boolean includes(double value) {
		if (this.fromEndPoint.closed) {
			if (value < this.fromEndPoint.value) {
				return false;
			}
		} else {
			if (value <= this.fromEndPoint.value) {
				return false;
			}
		}
		if (this.untilEndPoint.closed) {
			if (value > this.untilEndPoint.value) {
				return false;
			}
		} else {
			if (value >= this.untilEndPoint.value) {
				return false;
			}
		}
		return true;
	}

	public boolean includes(Interval that) {
		if (this.fromEndPoint.value > that.fromEndPoint.value) {
			return false;
		}
		if (this.fromEndPoint.closed) {
		} else {
			if (this.fromEndPoint.value == that.fromEndPoint.value && that.fromEndPoint.closed) {
				return false;
			}
		}
		if (this.untilEndPoint.value < that.untilEndPoint.value) {
			return false;
		}
		if (this.untilEndPoint.closed) {
		} else {
			if (this.untilEndPoint.value == that.untilEndPoint.value && that.untilEndPoint.closed) {
				return false;
			}
		}
		return true;
	}
	
}
