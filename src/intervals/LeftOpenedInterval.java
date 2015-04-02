package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}
	
	@Override
	public Opening getOpening() {
		return Opening.LEFT_OPENED;
	}
}
