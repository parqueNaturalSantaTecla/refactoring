package interval.v20;

public class Interval {

	private From from;

	private UntilEndPoint untilEndPoint;

	public Interval(From from, UntilEndPoint untilEndPoint) {
		this.from = from;
		this.untilEndPoint = untilEndPoint;
	}

	public void shift(double value) {
		this.from.shift(value);
		this.untilEndPoint.shift(value);
	}

	public double length() {
		if (this.from.getValue() == Double.NEGATIVE_INFINITY) {
			return Double.POSITIVE_INFINITY;
		}
		return this.untilEndPoint.getValue() - this.from.getValue();
	}

	public boolean includes(double value) {
		return this.includes(new IntervalBuilder().closed(value).closed(value).build());
	}

	public boolean includes(Interval that) {
		return this.from.onLeft(that.from) && this.untilEndPoint.onRight(that.untilEndPoint);
	}
	

}
