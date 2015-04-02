package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening) {
		case UNOPENED:
			return new UnopenedInterval(minimum, maximum);
			
		default:
			return new Interval(minimum, maximum, opening);
		}
	}
}
