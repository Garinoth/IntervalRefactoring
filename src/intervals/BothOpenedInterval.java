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
}
