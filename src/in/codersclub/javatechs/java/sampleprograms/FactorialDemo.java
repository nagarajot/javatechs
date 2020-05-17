package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class FactorialDemo
{
 public static void main(String args[])
 {
  int n;
  
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Enter a number : ");
  n = scanner.nextInt();
  scanner.close();
  
  System.out.println("Factorial of " + n + " = " + Factorial.findFactorial(n));
 }
}

