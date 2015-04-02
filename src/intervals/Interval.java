package intervals;

public abstract class Interval {
	
	private double minimum;
	private double maximum;
	private Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}
	
	public Interval(double minimum, double maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public abstract Opening getOpening();
	
	public double midPoint() {
		return (minimum + maximum)/2;
	}

	public boolean includes(double value) {
		boolean result = false;
		if (minimum < value && value < maximum) {
			result = true;
		} else if (minimum == value) {
			result = (this.getOpening() == Opening.RIGHT_OPENED) || (this.getOpening() == Opening.UNOPENED);
		} else if (maximum == value) {
			result = (this.getOpening() == Opening.LEFT_OPENED) || (this.getOpening() == Opening.UNOPENED);
		}
		return result;
	}
	
	public boolean includes(Interval interval) {
		boolean result = false;
		if (includes(interval.minimum) && includes (interval.maximum)) {
			result = true;
		} else if ((this.minimum == interval.minimum) && interval.maximum < this.maximum) { 
			if (this.getOpening() == Opening.BOTH_OPENED || this.getOpening() == Opening.LEFT_OPENED) {
				if (interval.getOpening() == Opening.BOTH_OPENED || interval.getOpening() == Opening.LEFT_OPENED) {
					result = true;
				}
			} else if (this.getOpening() == Opening.RIGHT_OPENED || this.getOpening() == Opening.UNOPENED) {
				result = true;
			}
		} else if ((this.maximum == interval.maximum) && interval.minimum > this.minimum) { 
			if (this.getOpening() == Opening.BOTH_OPENED || this.getOpening() == Opening.RIGHT_OPENED) {
				if (interval.getOpening() == Opening.BOTH_OPENED || interval.getOpening() == Opening.RIGHT_OPENED) {
					result = true;
				}
			} else if (this.getOpening() == Opening.LEFT_OPENED || this.getOpening() == Opening.UNOPENED) {
				result = true;
			}
		} else if ((this.minimum == interval.minimum) && interval.maximum == this.maximum) { 
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
