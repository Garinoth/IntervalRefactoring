package intervals;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.RIGHT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		ClosedPoint valuePoint = new ClosedPoint(value);
		return getMinimum().lesserOrEqualsThan(valuePoint) && getMaximum().greaterThan(valuePoint);
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return (interval.includes(this.getMinimum().getValue()))
			&& (interval.includes(this.getMaximum().getValue()) || getMaximum().getValue() == interval.getMaximum().getValue());
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(this.getMinimum().getValue()))
			&& (interval.includes(this.getMaximum().getValue()));
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return (interval.includes(this.getMinimum().getValue()) || getMinimum().getValue() == interval.getMinimum().getValue())
			&& (interval.includes(this.getMaximum().getValue()) || getMaximum().getValue() == interval.getMaximum().getValue());
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return (interval.includes(this.getMinimum().getValue()) || getMinimum().getValue() == interval.getMinimum().getValue())
			&& (interval.includes(this.getMaximum().getValue()));
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if (getMinimum().getValue() == interval.getMaximum().getValue()) {
			return interval.getOpening() == Opening.LEFT_OPENED
					|| interval.getOpening() == Opening.UNOPENED;
		}
		if (getMaximum().getValue() == interval.getMinimum().getValue()) {
			return false;
		}
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}
}
