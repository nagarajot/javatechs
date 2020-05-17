package in.codersclub.javatechs.java.exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptionExample
{
	public static void main(String args[])
	{
		int a,b;
		int quotient;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 integers : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		
		quotient = a / b;
		System.out.println("quotient = " + quotient);
	}
}