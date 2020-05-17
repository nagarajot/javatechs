package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Dummy;


public class DummyTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
	}

	@Test
	public void testM1() {
		assertEquals(1,Dummy.m1());
	}

	@Test
	public void testM2() {
		assertEquals(2,Dummy.m2());
	}

	@Test
	public void testM3() {
		assertEquals(3,Dummy.m3());
	}
}

