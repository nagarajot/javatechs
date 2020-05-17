package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.codersclub.j2eedemo.junit4.SumOfSquares;

public class SumOfSquaresTest {

	@Test
	public void testFindSumOfSquares() {
		assertEquals(14,SumOfSquares.findSumOfSquares(3));
	}
}






