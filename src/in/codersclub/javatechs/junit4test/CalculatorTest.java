package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Calculator;


public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals(20,Calculator.add(12, 8));
	}

	@Test
	public void testSub() {
		assertEquals(4,Calculator.sub(12, 8));
	}

	@Test
	public void testMultiply() {
		assertEquals(96,Calculator.multiply(12, 8));
	}

	@Test
	public void testDivide() {
		assertEquals(1,Calculator.divide(12, 8));
	}

	@Test
	public void testModulo() {
		assertEquals(4,Calculator.modulo(12, 8));
	}

}
