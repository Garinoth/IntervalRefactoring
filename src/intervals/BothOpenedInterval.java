package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.BOTH_OPENED;
	}

	@Override
	public boolean includes(double value) {
		ClosedPoint valuePoint = new ClosedPoint(value);
		return getMinimum().lesserThan(valuePoint) && getMaximum().greaterThan(valuePoint);
	}

	@Override
	public boolean includes(Interval interval) {
		return this.getMinimum().lesserOrEqualsThan(interval.getMinimum()) && this.getMaximum().greaterOrEqualsThan(interval.getMaximum());
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}
}
