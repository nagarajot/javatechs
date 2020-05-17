package in.codersclub.javatechs.java.exceptionhandling;

import java.util.Scanner;

public class NumberFormatExceptionExample
{
	public static void main(String args[])
	{
/*		
		String str = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		str = scanner.next();
		scanner.close();
*/		
		int a = Integer.parseInt("abc");
		System.out.println("a = " + a);
	}
}