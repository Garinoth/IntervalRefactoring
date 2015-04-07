package intervals;

public class ClosedPoint extends Point {

	public ClosedPoint(Integer value) {
		super(value);
	}

	@Override
	public boolean greaterOrEqualsThan(Point point) {
		return lesserOrEqualsThan(this);
	}

	@Override
	public boolean greaterOrEqualsThan(OpenedPoint point) {
		return this.greaterThan(point);
	}

	@Override
	public boolean greaterOrEqualsThan(ClosedPoint point) {
		return this.getValue() >= point.getValue();
	}

	@Override
	public boolean lesserOrEqualsThan(Point point) {
		return greaterOrEqualsThan(this);
	}

	@Override
	public boolean lesserOrEqualsThan(OpenedPoint point) {
		return this.lesserThan(point);
	}

	@Override
	public boolean lesserOrEqualsThan(ClosedPoint point) {
		return this.getValue() <= point.getValue();
	}

}
