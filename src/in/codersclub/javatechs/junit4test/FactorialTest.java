package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Factorial;

public class FactorialTest {

	@Test
	public void testFindFactorial() {
		assertEquals(6,Factorial.findFactorial(3));
		assertEquals(24,Factorial.findFactorial(4));
		assertEquals(120,Factorial.findFactorial(5));
	}
}




