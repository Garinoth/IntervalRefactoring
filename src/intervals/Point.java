package intervals;

public abstract class Point {

	private Integer value;
	
	public Point(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
	
	public abstract boolean greaterThan(Point point);
	public abstract boolean greaterOrEqualsThan(Point point);
	public abstract boolean lesserThan(Point point);
	public abstract boolean lesserOrEqualsThan(Point point);
	
	@Override
	public abstract boolean equals(Object obj);
}
