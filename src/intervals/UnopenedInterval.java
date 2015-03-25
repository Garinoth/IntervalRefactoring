package intervals;

public class UnopenedInterval extends Interval {

	public UnopenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public Opening getOpening() {
		return Opening.UNOPENED;
	}

}
