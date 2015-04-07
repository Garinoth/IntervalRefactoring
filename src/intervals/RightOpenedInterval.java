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
		switch (interval.getOpening()) {
		case BOTH_OPENED:
			return (this.includes(interval.getMinimum()) || getMinimum() == interval.getMinimum())
					&& (this.includes(interval.getMaximum()) || getMaximum() == interval
							.getMaximum());
		case LEFT_OPENED:
			return (this.includes(interval.getMinimum()) || getMinimum() == interval.getMinimum())
					&& (this.includes(interval.getMaximum()));
		case RIGHT_OPENED:
			return (this.includes(interval.getMinimum()) || getMinimum() == interval.getMinimum())
					&& (this.includes(interval.getMaximum()) || getMaximum() == interval
							.getMaximum());
		case UNOPENED:
			return (this.includes(interval.getMinimum()) || getMinimum() == interval.getMinimum())
					&& (this.includes(interval.getMaximum()));
		default:
			assert false;
			return false;
		}
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
