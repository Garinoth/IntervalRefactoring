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

	public boolean intersectsWith(Interval interval) {
		if (getMinimum() == interval.getMaximum()) {
			switch (getOpening()) {
			default:
				assert false;
				return false;
			}
		}
		if (getMaximum() == interval.getMinimum()) {
			switch (getOpening()) {
			default:
				assert false;
				return false;
			}
		}
		return this.includes(interval.getMinimum())
				|| this.includes(interval.getMaximum());
	}

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
