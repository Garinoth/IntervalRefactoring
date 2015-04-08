package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.LEFT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		ClosedPoint valuePoint = new ClosedPoint(value);
		return getMinimum().lesserThan(valuePoint) && getMaximum().greaterOrEqualsThan(valuePoint);
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return interval.getMinimum().lesserOrEqualsThan(this.getMinimum()) && interval.getMaximum().greaterOrEqualsThan(this.getMaximum());
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return interval.getMinimum().lesserOrEqualsThan(this.getMinimum()) && interval.getMaximum().greaterOrEqualsThan(this.getMaximum());
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return interval.getMinimum().lesserOrEqualsThan(this.getMinimum()) && interval.getMaximum().greaterOrEqualsThan(this.getMaximum());
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return interval.getMinimum().lesserOrEqualsThan(this.getMinimum()) && interval.getMaximum().greaterOrEqualsThan(this.getMaximum());
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if (getMinimum().getValue() == interval.getMaximum().getValue()) {
			return false;
		}
		if (getMaximum().getValue() == interval.getMinimum().getValue()) {
			return interval.getOpening() == Opening.RIGHT_OPENED
					|| interval.getOpening() == Opening.UNOPENED;
		}
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}

}
