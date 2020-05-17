package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.SimpleInterest;

public class SImpleInterestTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindSimpleInterest() {
		assertEquals(2000.0, SimpleInterest.findSimpleInterest(10000,2,10),2);
		assertEquals(320.0, SimpleInterest.findSimpleInterest(1000,4,8),2);
	}
}



