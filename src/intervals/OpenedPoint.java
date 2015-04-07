package intervals;

public class OpenedPoint extends Point {

	public OpenedPoint(Integer value) {
		super(value);
	}

	@Override
	public boolean greaterOrEqualsThan(Point point) {
		return lesserOrEqualsThan(this);
	}

	@Override
	public boolean greaterOrEqualsThan(OpenedPoint point) {
		return this.getValue() >= point.getValue();
	}

	@Override
	public boolean greaterOrEqualsThan(ClosedPoint point) {
		return this.greaterThan(point);
	}
	
	@Override
	public boolean lesserOrEqualsThan(Point point) {
		return greaterOrEqualsThan(this);
	}

	@Override
	public boolean lesserOrEqualsThan(OpenedPoint point) {
		return this.getValue() <= point.getValue(); 
	}

	@Override
	public boolean lesserOrEqualsThan(ClosedPoint point) {
		return this.lesserThan(point);
	}

}
