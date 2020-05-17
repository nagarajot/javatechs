package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Trig;

public class TrigTest {

	Trig t1,t2,t3;
	
	@Before
	public void setUp() throws Exception {
		t1 = new Trig(2,3,2);
		t2 = new Trig(3,4,5);
		t3 = new Trig(3,3,3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTriangleType() {
		if ( t3.isTriangle() )
			assertEquals("Equilateral",t3.triangleType());
		else
			fail("t3 : triangle not formed");
		
		if ( t1.isTriangle())
			assertEquals("Isosceles",t1.triangleType());
		else
			fail("t1 : triangle not formed");
		
		
		if ( t2.isTriangle())
			assertEquals("Scalene",t2.triangleType());
		else
			fail("t2 : triangle not formed");
	}
}



