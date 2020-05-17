package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Quadrant;

public class QuadrantTest {

	@Test
	public void testFindQuandrant() {
		assertEquals(1,Quadrant.findQuandrant(2, 3));
		assertEquals(3,Quadrant.findQuandrant(-2, -3));
		
		assertNotEquals(2,Quadrant.findQuandrant(2, 3));
		assertNotEquals(1,Quadrant.findQuandrant(-2, -3));
	}
}


