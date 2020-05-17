package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class MaximumDemo
{
 public static void main(String args[])
 {
  int a,b,c;
  
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Enter 3 numbers ...");
  a = scanner.nextInt();
  b = scanner.nextInt();
  c = scanner.nextInt();
  
  System.out.println(Maximum.findMaximum(a,b));
  System.out.println(Maximum.findMaximum(a,b,c));
 }
}


