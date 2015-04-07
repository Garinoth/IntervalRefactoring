package intervals;

public class OpenedPoint extends Point {

	public OpenedPoint(Integer value) {
		super(value);
	}

	@Override
	public boolean greaterThan(Point point) {
		return this.getValue() > point.getValue();
	}

	@Override
	public boolean greaterOrEqualsThan(Point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lesserThan(Point point) {
		return this.getValue() < point.getValue();
	}

	@Override
	public boolean lesserOrEqualsThan(Point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
