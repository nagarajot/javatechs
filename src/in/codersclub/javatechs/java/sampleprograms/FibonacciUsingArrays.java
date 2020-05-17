package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class FibonacciUsingArrays
{
	public static void main(String args[])
	{
		int a[] = new int[20];
		int n;
  
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of terms in Fibonacci series : ");
  
		n = scanner.nextInt();
		scanner.close();
  
		a[0] = 0;
		a[1] = 1;
  
		for ( int i = 2; i < n; i++ )
			a[i] = a[i-1] + a[i-2];

		for ( int i = 0; i < n; i++ )
			System.out.println(a[i]);
	}
}

