package intervals;

public class Interval {
	
	private double minimum;
	private double maximum;
	private Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (minimum + maximum)/2;
	}

	public boolean includes(double value) {
		boolean result = false;
		if (minimum < value && value < maximum) {
			result = true;
		} else if (minimum == value) {
			result = (opening == Opening.RIGHT_OPENED) || (opening == Opening.UNOPENED);
		} else if (maximum == value) {
			result = (opening == Opening.LEFT_OPENED) || (opening == Opening.UNOPENED);
		}
		return result;
	}
	
	public boolean includes(Interval interval) {
		boolean result = false;
		if (includes(interval.minimum) && includes (interval.maximum)) {
			result = true;
		} else if ((this.minimum == interval.minimum) && interval.maximum < this.maximum) { 
			if (this.opening == Opening.BOTH_OPENED || this.opening == Opening.LEFT_OPENED) {
				if (interval.opening == Opening.BOTH_OPENED || interval.opening == Opening.LEFT_OPENED) {
					result = true;
				}
			} else if (this.opening == Opening.RIGHT_OPENED || this.opening == Opening.UNOPENED) {
				result = true;
			}
		} else if ((this.maximum == interval.maximum) && interval.minimum > this.minimum) { 
			if (this.opening == Opening.BOTH_OPENED || this.opening == Opening.RIGHT_OPENED) {
				if (interval.opening == Opening.BOTH_OPENED || interval.opening == Opening.RIGHT_OPENED) {
					result = true;
				}
			} else if (this.opening == Opening.LEFT_OPENED || this.opening == Opening.UNOPENED) {
				result = true;
			}
		} else if ((this.minimum == interval.minimum) && interval.maximum == this.maximum) { 
			if (this.opening.equals(interval.opening)) {
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

	public Opening getOpening() {
		return opening;
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
