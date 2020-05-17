package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Circle;


public class CircleTest {

	Circle c1,c2;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Circle(3);
		c2 = new Circle(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPerimeter() {
		assertEquals(18.84,c1.getPerimeter(),2);
		assertEquals(31.4,c2.getPerimeter(),1);
	}

	@Test
	public void testGetArea() {
		assertEquals(28.26,c1.getArea(),2);
		assertEquals(78.5,c2.getArea(),1);
	}

}
