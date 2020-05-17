package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Prime;

public class PrimeTest {

	@Test
	public void testIsPrime() {
		assertEquals(false,Prime.isPrime(1));
		assertEquals(true,Prime.isPrime(2));
		assertEquals(true,Prime.isPrime(11));
		
		assertEquals(false,Prime.isPrime(6));
		assertNotEquals(true,Prime.isPrime(6));
	}
}

