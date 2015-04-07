package intervals;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.RIGHT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return getMinimum() <= value && value < getMaximum();
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return (interval.includes(this.getMinimum()))
			&& (interval.includes(this.getMaximum()) || getMaximum() == interval.getMaximum());
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return (interval.includes(this.getMinimum()))
			&& (interval.includes(this.getMaximum()));
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return (interval.includes(this.getMinimum()) || getMinimum() == interval.getMinimum())
			&& (interval.includes(this.getMaximum()) || getMaximum() == interval.getMaximum());
	}

	@Override
	public boolean isIncluded(UnopenedInterval interval) {
		return (interval.includes(this.getMinimum()) || getMinimum() == interval.getMinimum())
			&& (interval.includes(this.getMaximum()));
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		if (getMinimum() == interval.getMaximum()) {
			return interval.getOpening() == Opening.LEFT_OPENED
					|| interval.getOpening() == Opening.UNOPENED;
		}
		if (getMaximum() == interval.getMinimum()) {
			return false;
		}
		return this.includes(interval.getMinimum())
				|| this.includes(interval.getMaximum());
	}
}
