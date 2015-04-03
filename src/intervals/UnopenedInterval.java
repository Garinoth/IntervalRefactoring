package intervals;

public class UnopenedInterval extends Interval {

	public UnopenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getOpening() {
		return Opening.UNOPENED;
	}
	
	@Override
	public boolean includes(double value) {
		return getMinimum() <= value && value <= getMaximum();
	}
}
