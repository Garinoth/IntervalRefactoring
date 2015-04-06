package intervals;

public abstract class Interval {
	
	private double minimum;
	private double maximum;
	
	public Interval(double minimum, double maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double getMinimum() {
		return minimum;
	}

	public double getMaximum() {
		return maximum;
	}

	public abstract Opening getOpening();
	
	public double midPoint() {
		return (getMinimum() + getMaximum())/2;
	}

	public abstract boolean includes(double value);
	
	public abstract boolean includes(Interval interval);
	public abstract boolean includes(BothOpenedInterval interval);
	public abstract boolean includes(LeftOpenedInterval interval);
	public abstract boolean includes(RightOpenedInterval interval);
	public abstract boolean includes(UnopenedInterval interval);

	public abstract boolean intersectsWith(Interval interval);

	@Override
	public String toString() {
		//TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		//TODO
		return false;
	}
}
