package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.codersclub.j2eedemo.junit4.Palindrome;

public class PalindromeTest {

	@Test
	public void test() {
		assertEquals(true,Palindrome.isPalindrome("abcba"));
		assertEquals(true,Palindrome.isPalindrome("gadag"));
		
		assertNotEquals(true,Palindrome.isPalindrome("delhi"));
	}
}



