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
}
