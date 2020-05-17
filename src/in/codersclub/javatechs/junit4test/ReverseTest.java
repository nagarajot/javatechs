package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Reverse;

public class ReverseTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverse() {
	      assertEquals("fedcba",Reverse.reverse("abcdef"));
	}

}


