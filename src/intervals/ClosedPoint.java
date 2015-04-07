package intervals;

public class ClosedPoint extends Point {

	public ClosedPoint(Integer value) {
		super(value);
	}

	@Override
	public boolean greaterOrEqualsThan(Point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean greaterOrEqualsThan(OpenedPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean greaterOrEqualsThan(ClosedPoint point) {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public boolean lesserOrEqualsThan(Point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lesserOrEqualsThan(OpenedPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lesserOrEqualsThan(ClosedPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

}
