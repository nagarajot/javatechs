package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class SquareRoot 
{ 
   public static void main(String args[]) 
   { 
	   int n; 
 
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter a number : ");
	   
	   n = scanner.nextInt();
	   scanner.close();
	   
	   for ( int i = 1; i <= n; i++ ) 
		   System.out.println(i + "    " + Math.sqrt(i)); 
   }   
}


