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
	
	public boolean includes(Interval interval) {
		boolean result = false;
		if (includes(interval.getMinimum()) && includes (interval.getMaximum())) {
			result = true;
		} else if ((this.getMinimum() == interval.getMinimum()) && interval.getMaximum() < this.getMaximum()) { 
			if (this.getOpening() == Opening.BOTH_OPENED || this.getOpening() == Opening.LEFT_OPENED) {
				if (interval.getOpening() == Opening.BOTH_OPENED || interval.getOpening() == Opening.LEFT_OPENED) {
					result = true;
				}
			} else if (this.getOpening() == Opening.RIGHT_OPENED || this.getOpening() == Opening.UNOPENED) {
				result = true;
			}
		} else if ((this.getMaximum() == interval.getMaximum()) && interval.getMinimum() > this.getMinimum()) { 
			if (this.getOpening() == Opening.BOTH_OPENED || this.getOpening() == Opening.RIGHT_OPENED) {
				if (interval.getOpening() == Opening.BOTH_OPENED || interval.getOpening() == Opening.RIGHT_OPENED) {
					result = true;
				}
			} else if (this.getOpening() == Opening.LEFT_OPENED || this.getOpening() == Opening.UNOPENED) {
				result = true;
			}
		} else if ((this.getMinimum() == interval.getMinimum()) && interval.getMaximum() == this.getMaximum()) { 
			if (this.getOpening().equals(interval.getOpening())) {
				result = true;
			}
		}
		return result;
	}
	
	public boolean intersectsWith(Interval interval) {
		//TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		//TODO
		return null;
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
