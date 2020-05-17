package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Average;

public class AverageTest {

	private	int a[] = { 10, 20, 30 , 40 , 50 };
    private int b[] = { 10, 20, 30, 40 };
    private int c[] = { 5,10 };
    private int d[] = { 5,5,10 };
	
	@Test
	public void test() {
		assertEquals(30.0,Average.findAverage(a),0);
		assertEquals(25.0,Average.findAverage(b),0);
	 	assertEquals(7.5,Average.findAverage(c),1);
		assertEquals(6.66,Average.findAverage(d),2);
	}

}






