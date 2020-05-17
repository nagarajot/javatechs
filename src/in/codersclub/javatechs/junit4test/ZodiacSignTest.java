package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.ZodiacSign;

public class ZodiacSignTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindZodiacSign() {
		assertEquals("Pisces",ZodiacSign.findZodiacSign(1,3));
		assertEquals("Taurus",ZodiacSign.findZodiacSign(20,4));
		assertEquals("Leo",ZodiacSign.findZodiacSign(30,7));
		assertEquals("Taurus",ZodiacSign.findZodiacSign(25,4));
		assertEquals("Virgo",ZodiacSign.findZodiacSign(30,8));
	}
}





