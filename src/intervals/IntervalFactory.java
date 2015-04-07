package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening) {
		case BOTH_OPENED:
			return new BothOpenedInterval(new OpenedPoint(minimum), new OpenedPoint(maximum));
		case LEFT_OPENED:
			return new LeftOpenedInterval(new OpenedPoint(minimum), new ClosedPoint(maximum));
		case RIGHT_OPENED:
			return new RightOpenedInterval(new ClosedPoint(minimum), new OpenedPoint(maximum));
		case UNOPENED:
			return new UnopenedInterval(new ClosedPoint(minimum), new ClosedPoint(maximum));
			
		default:
			throw new IllegalArgumentException("Invalid type code value");
		}
	}
}
