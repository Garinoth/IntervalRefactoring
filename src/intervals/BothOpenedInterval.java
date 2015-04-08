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
		return interval.isIncluded(this);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return (interval.includes(getMinimum().getValue()) || getMinimum().getValue() == interval.getMinimum().getValue())
			&& (interval.includes(getMaximum().getValue()) || getMaximum().getValue() == interval.getMaximum().getValue());
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(getMinimum().getValue()) || getMinimum().getValue() == interval.getMinimum().getValue()) 
			&& (interval.includes(getMaximum().getValue()));
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return (interval.includes(getMinimum().getValue()))
			&& (interval.includes(getMaximum().getValue()) || getMaximum().getValue() == interval.getMaximum().getValue());
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return (interval.includes(getMinimum().getValue()))
			&& (interval.includes(getMaximum().getValue()));
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}
}
