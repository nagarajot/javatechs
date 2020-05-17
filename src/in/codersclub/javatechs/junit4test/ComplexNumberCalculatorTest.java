package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.ComplexNumber;
import in.codersclub.j2eedemo.junit4.ComplexNumberCalculator;


public class ComplexNumberCalculatorTest {

	ComplexNumber c1, c2, c3;
	
	@Before
	public void setUp() throws Exception {
		c1 = new ComplexNumber(2,3);
		c2 = new ComplexNumber(4,5);
		c3 = new ComplexNumber(6,7);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		c3 = ComplexNumberCalculator.add(c1, c2);
		assertEquals(6,c3.getRealPart());
		assertEquals(8,c3.getImgPart());
	}

	@Test
	public void testSub() {
		c3 = ComplexNumberCalculator.sub(c1, c2);
		assertEquals(-2,c3.getRealPart());
		assertEquals(-2,c3.getImgPart());
	}
}




