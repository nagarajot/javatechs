package jit;

import java.util.Scanner;

public class OddEven
{
	public static void main(String args[])
	{
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		n = scanner.nextInt();
		
		if ( n % 2 == 0 )
			System.out.println("Even");
		else
			System.out.println("odd");
	}
}

