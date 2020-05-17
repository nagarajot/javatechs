package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class StringInSwitch
{
	public static void main(String args[])
	{
		String month;
		int days = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first 3 chars of a month : ");
		month = scanner.next();
		scanner.close();

		month = month.toUpperCase();
		
		switch (month)
		{
			case "JAN" :
			case "MAR" :
			case "MAY" :
			case "JUL" :
			case "AUG" :
			case "OCT" :
			case "DEC" :
				days = 31;
				break;

			case "APR" :
			case "JUN" :
			case "SEP" :
			case "NOV" :
				days = 30;
				break;

			case "FEB" :
				days = 28;
				break;
		}
		System.out.println("No of days : " + days);
	}
}

