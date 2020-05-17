package in.codersclub.javatechs.java.exceptionhandling;

import java.util.Scanner;

public class InputMismatchExceptionExample
{
	public static void main(String args[])
	{
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer value : ");
		n = scanner.nextInt();
		scanner.close();
		
		System.out.println("n = " + n);
	}
}