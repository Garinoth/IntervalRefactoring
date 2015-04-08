package intervals;

public class UnopenedInterval extends Interval {

	public UnopenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.UNOPENED;
	}

	@Override
	public boolean includes(double value) {
		ClosedPoint valuePoint = new ClosedPoint(value);
		return getMinimum().lesserOrEqualsThan(valuePoint) && getMaximum().greaterOrEqualsThan(valuePoint);
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if (getMinimum().getValue() == interval.getMaximum().getValue()) {
			return interval.getOpening() == Opening.LEFT_OPENED
					|| interval.getOpening() == Opening.UNOPENED;
		}
		if (getMaximum().getValue() == interval.getMinimum().getValue()) {
			return interval.getOpening() == Opening.RIGHT_OPENED
					|| interval.getOpening() == Opening.UNOPENED;
		}
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}
}
