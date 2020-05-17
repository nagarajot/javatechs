package in.codersclub.javatechs.java;

import java.util.Scanner;

public class SimpleInterestDemo
{
	public static void main(String args[])
	{
		int principle;
		int term;
		int rateOfInterest;
  
		Scanner scanner = new Scanner(System.in);
  
		System.out.println("Enter principle, term, rate of interest ...");
		principle = scanner.nextInt();
		term = scanner.nextInt();
		rateOfInterest = scanner.nextInt();
		scanner.close();
  
		System.out.println("Simple interest = " + SimpleInterest.findSimpleInterest(principle, term, rateOfInterest));  
	}
}


