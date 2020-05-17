package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class Fibonacci 
{ 
   public static void main(String args[]) 
   { 
      int n;

      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the number of terms in the Fibonacci series = "); 
      n = scanner.nextInt();
      scanner.close();

      int firstterm = 0; 
      int secondterm = 1; 
      int nextterm;

      System.out.print(firstterm + " " + secondterm + " ");

      for ( int i = 3; i <= n; i++ ) 
      { 
          nextterm = firstterm + secondterm; 
          firstterm = secondterm; 
          secondterm = nextterm; 
          System.out.print(nextterm + " "); 
      } 
   } 
}


