package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class FibonacciRecursion
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("No of elements in Fibonacci series : ");
		int n = scanner.nextInt();
		scanner.close();
		
		for ( int i = 0; i < n; i++ )
			System.out.println(fibonacci(i));
	}
 
	private static int fibonacci(int n)
	{
		if ( n == 0 )
			return 0;
		else if ( n == 1 )
			return 1;
		else
			return ( fibonacci(n-1) + fibonacci(n-2) );
	} 
}


