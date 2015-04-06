package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.LEFT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return getMinimum() < value && value <= getMaximum();
	}

	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getMinimum());
		boolean maximumIncluded = this.includes(interval.getMaximum());
		switch (interval.getOpening()) {
		case BOTH_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval
							.getMaximum());
		case LEFT_OPENED:
			return (minimumIncluded || getMinimum() == interval.getMinimum())
					&& (maximumIncluded || getMaximum() == interval
							.getMaximum());
		case RIGHT_OPENED:
			return (minimumIncluded)
					&& (maximumIncluded || getMaximum() == interval
							.getMaximum());
		case UNOPENED:
			return (minimumIncluded)
					&& (maximumIncluded || getMaximum() == interval
							.getMaximum());
		default:
			assert false;
			return false;
		}
	}
}
