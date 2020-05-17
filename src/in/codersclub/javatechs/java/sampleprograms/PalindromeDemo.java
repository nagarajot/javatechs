package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class PalindromeDemo
{
 public static void main(String args[])
 {
  String s;
  
  Scanner scanner = new Scanner(System.in);
  
        System.out.println("Enter a string : ");
        s = scanner.next();
        scanner.close();
        
        if ( Palindrome.isPalindrome(s))
         System.out.println("Palindrome ...");
        else 
         System.out.println("Not a Palindrome ...");
  
 }
}

