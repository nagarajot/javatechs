package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class PrimeDemo
{
 public static void main(String args[])
 {
  int n;
  
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Enter a number : ");
  n = scanner.nextInt();
  scanner.close();
  
  if ( Prime.isPrime(n))
   System.out.println("Prime ...");
  else
   System.out.println("No a Prime ...");
 }
}


