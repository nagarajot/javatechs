package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class PrintNumbers
{
 public static void main(String args[])
 {
  int n=0;
  
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a number : ");
  
  n = scanner.nextInt();
  scanner.close();
  
  for ( int i = 1; i <= n; i++ )
   System.out.println(i);
 }
}

