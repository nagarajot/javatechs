package jit;

import java.util.Scanner;

public class Vowel
{
	public static void main(String args[])
	{
		String s;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a char : ");
		s = scanner.next();
		
		boolean flag = false;
		
		switch (s)
		{
		case "a":
		case "A":
		case "e":
		case "E":
		case "i":
		case "I":
		case "o":
		case "O":
		case "u":
		case "U":
			flag = true;
			break;
		}
		if ( flag == true )
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}
}






