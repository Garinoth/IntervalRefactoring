package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import intervals.ClosedPoint;
import intervals.OpenedPoint;

import org.junit.Test;

public class PointTest {

	@Test
	public void testGreaterThan() {
		OpenedPoint openedPoint1 = new OpenedPoint(0);
		OpenedPoint openedPoint2 = new OpenedPoint(5);
		
		ClosedPoint closedPoint1 = new ClosedPoint(0);
		ClosedPoint closedPoint2 = new ClosedPoint(5);
		
		assertFalse(openedPoint1.greaterThan(openedPoint1));
		assertFalse(openedPoint1.greaterThan(openedPoint2));
		assertFalse(openedPoint1.greaterThan(closedPoint1));
		assertFalse(openedPoint1.greaterThan(closedPoint2));
		
		assertTrue(openedPoint2.greaterThan(openedPoint1));
		assertTrue(openedPoint2.greaterThan(closedPoint1));

		assertFalse(closedPoint1.greaterThan(openedPoint1));
		assertFalse(closedPoint1.greaterThan(openedPoint2));
		assertFalse(closedPoint1.greaterThan(closedPoint1));
		assertFalse(closedPoint1.greaterThan(closedPoint2));
		
		assertTrue(closedPoint2.greaterThan(openedPoint1));
		assertTrue(closedPoint2.greaterThan(closedPoint1));
	}

	@Test
	public void testLesserThan() {
		OpenedPoint openedPoint1 = new OpenedPoint(0);
		OpenedPoint openedPoint2 = new OpenedPoint(5);
		
		ClosedPoint closedPoint1 = new ClosedPoint(0);
		ClosedPoint closedPoint2 = new ClosedPoint(5);
		
		assertFalse(openedPoint2.lesserThan(openedPoint1));
		assertFalse(openedPoint2.lesserThan(openedPoint2));
		assertFalse(openedPoint2.lesserThan(closedPoint1));
		assertFalse(openedPoint2.lesserThan(closedPoint2));
		
		assertTrue(openedPoint1.lesserThan(openedPoint2));
		assertTrue(openedPoint1.lesserThan(closedPoint2));

		assertFalse(closedPoint2.lesserThan(openedPoint1));
		assertFalse(closedPoint2.lesserThan(openedPoint2));
		assertFalse(closedPoint2.lesserThan(closedPoint1));
		assertFalse(closedPoint2.lesserThan(closedPoint2));
		
		assertTrue(closedPoint1.lesserThan(openedPoint2));
		assertTrue(closedPoint1.lesserThan(closedPoint2));
	}

	@Test
	public void testGreaterOrEqualsThanPoint() {
		OpenedPoint openedPoint1 = new OpenedPoint(0);
		OpenedPoint openedPoint2 = new OpenedPoint(5);
		
		ClosedPoint closedPoint1 = new ClosedPoint(0);
		ClosedPoint closedPoint2 = new ClosedPoint(5);
		
		assertTrue(openedPoint1.greaterOrEqualsThan(openedPoint1));
		assertFalse(openedPoint1.greaterOrEqualsThan(openedPoint2));
		assertFalse(openedPoint1.greaterOrEqualsThan(closedPoint1));
		assertFalse(openedPoint1.greaterOrEqualsThan(closedPoint2));
		
		assertTrue(openedPoint2.greaterOrEqualsThan(openedPoint1));
		assertTrue(openedPoint2.greaterOrEqualsThan(closedPoint1));

		assertFalse(closedPoint1.greaterOrEqualsThan(openedPoint1));
		assertFalse(closedPoint1.greaterOrEqualsThan(openedPoint2));
		assertTrue(closedPoint1.greaterOrEqualsThan(closedPoint1));
		assertFalse(closedPoint1.greaterOrEqualsThan(closedPoint2));
		
		assertTrue(closedPoint2.greaterOrEqualsThan(openedPoint1));
		assertTrue(closedPoint2.greaterOrEqualsThan(closedPoint1));
	}

	@Test
	public void testLesserOrEqualsThanPoint() {
		OpenedPoint openedPoint1 = new OpenedPoint(0);
		OpenedPoint openedPoint2 = new OpenedPoint(5);
		
		ClosedPoint closedPoint1 = new ClosedPoint(0);
		ClosedPoint closedPoint2 = new ClosedPoint(5);
		
		assertTrue(openedPoint2.lesserOrEqualsThan(openedPoint1));
		assertFalse(openedPoint2.lesserOrEqualsThan(openedPoint2));
		assertFalse(openedPoint2.lesserOrEqualsThan(closedPoint1));
		assertFalse(openedPoint2.lesserOrEqualsThan(closedPoint2));
		
		assertTrue(openedPoint1.lesserOrEqualsThan(openedPoint2));
		assertTrue(openedPoint1.lesserOrEqualsThan(closedPoint2));

		assertFalse(closedPoint2.lesserOrEqualsThan(openedPoint1));
		assertFalse(closedPoint2.lesserOrEqualsThan(openedPoint2));
		assertFalse(closedPoint2.lesserOrEqualsThan(closedPoint1));
		assertTrue(closedPoint2.lesserOrEqualsThan(closedPoint2));
		
		assertTrue(closedPoint1.lesserOrEqualsThan(openedPoint2));
		assertTrue(closedPoint1.lesserOrEqualsThan(closedPoint2));
	}

}
