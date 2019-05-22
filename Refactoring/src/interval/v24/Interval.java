package interval.v24;

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
		return this.from.distance(this.untilEndPoint);
	}

	public boolean includes(double value) {
		return this.includes(new IntervalBuilder().closed(value).closed(value).build());
	}

	public boolean includes(Interval that) {
		return this.from.onLeft(that.from) && this.untilEndPoint.onRight(that.untilEndPoint);
	}
	

}
