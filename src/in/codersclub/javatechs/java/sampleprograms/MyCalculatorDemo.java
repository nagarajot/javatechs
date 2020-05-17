package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class MyCalculatorDemo
{
	public static void main(String args[])
	{
		int m,n;
		
		System.out.println("Enter 2 integers : ");
		Scanner scanner = new Scanner(System.in);
		
		m = scanner.nextInt();
		n = scanner.nextInt();
		scanner.close();
		
		System.out.println("sum = " + MyCalculator.add(m,n));
		System.out.println("product = " + MyCalculator.multiply(m, n));
	
		System.out.println("Square = " + MyCalculator.square(m));
		System.out.println("Square = " + MyCalculator.cube(m));
	}
}


