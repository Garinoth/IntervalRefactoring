package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.BOTH_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return getMinimum() < value && value < getMaximum();
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return (interval.includes(getMinimum()) || getMinimum() == interval.getMinimum())
			&& (interval.includes(getMaximum()) || getMaximum() == interval.getMaximum());
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(getMinimum()) || getMinimum() == interval.getMinimum()) 
			&& (interval.includes(getMaximum()));
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return (interval.includes(getMinimum()))
			&& (interval.includes(getMaximum()) || getMaximum() == interval.getMaximum());
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return (interval.includes(getMinimum()))
			&& (interval.includes(getMaximum()));
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		return this.includes(interval.getMinimum())
				|| this.includes(interval.getMaximum());
	}
}
