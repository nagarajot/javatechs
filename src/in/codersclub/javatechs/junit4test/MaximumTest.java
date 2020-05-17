package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Maximum;

public class MaximumTest {

	@Test
	public void testFindMaximumIntInt() {
		assertEquals(10, Maximum.findMaximum(4,10));
	}

	@Test
	public void testFindMaximumIntIntInt() {
		assertEquals(25,Maximum.findMaximum(5, 15,25));
	}

}
