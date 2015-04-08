package intervals;

public abstract class Interval {
	
	private Point minimum;
	private Point maximum;
	
	public Interval(Point minimum, Point maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public Point getMinimum() {
		return minimum;
	}

	public Point getMaximum() {
		return maximum;
	}

	public abstract Opening getOpening();
	
	public double midPoint() {
		return (getMinimum().getValue() + getMaximum().getValue())/2;
	}

	public abstract boolean includes(double value);
	
	public abstract boolean includes(Interval interval);

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
