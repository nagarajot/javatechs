package cc.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cc.programs.Triangle;

public class TriangleTest {

	Triangle t;
	
	@Before
	public void setUp() throws Exception {
		t = new Triangle();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPerimeter() {
		t.setA(4);
		t.setB(5);
		t.setC(6);
		assertEquals(15,t.getPerimeter(),0);
	}

	@Test
	public void testGetArea() {
		t.setA(4);
		t.setB(5);
		t.setC(6);
		assertEquals(9.92,t.getArea(),2);
	}

}
