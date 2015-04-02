package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening) {
		case UNOPENED:
			return new UnopenedInterval(minimum, maximum);
		case BOTH_OPENED:
			return new BothOpenedInterval(minimum, maximum);
		case LEFT_OPENED:
			return new LeftOpenedInterval(minimum, maximum);
		
		default:
			return new Interval(minimum, maximum, opening);
		}
	}
}
