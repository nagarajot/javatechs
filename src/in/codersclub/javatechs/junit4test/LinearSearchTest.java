package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.codersclub.j2eedemo.junit4.LinearSearch;

public class LinearSearchTest {

	int a[] = { 10, 20, 30 , 40 , 50 };
    int b[] = { 10, 20, 30, 40 };
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearch() {
	       assertEquals(LinearSearch.search(a,30),true);
           assertEquals(LinearSearch.search(a,33),false);
	}
}


