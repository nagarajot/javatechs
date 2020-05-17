package jit;

import java.util.Scanner;

public class PositiveNegative
{
	public static void main(String args[])
	{
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		n = scanner.nextInt();
		
		if ( n > 0 )
			System.out.println("Positive");
		else if ( n < 0 )
			System.out.println("Negative");
		else if ( n == 0 )
			System.out.println("Zero");
		
		
		
	}
}