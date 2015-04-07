package intervals;

public abstract class Point {

	private Integer value;
	
	public Point(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
	
	public boolean greaterThan(Point point) {
		return this.getValue() > point.getValue();
	}
	
	public boolean lesserThan(Point point) {
		return this.getValue() < point.getValue();
	}
	
	public abstract boolean greaterOrEqualsThan(Point point);
	public abstract boolean greaterOrEqualsThan(OpenedPoint point);
	public abstract boolean greaterOrEqualsThan(ClosedPoint point);

	public abstract boolean lesserOrEqualsThan(Point point);
	public abstract boolean lesserOrEqualsThan(OpenedPoint point);
	public abstract boolean lesserOrEqualsThan(ClosedPoint point);
}
