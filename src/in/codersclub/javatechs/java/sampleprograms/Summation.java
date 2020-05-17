package in.codersclub.javatechs.java.sampleprograms;

public class Summation 
{ 
   public static int findSummation(int n) 
   { 
      int sum = 0; 

      for ( int i = 1; i <= n; i++ ) 
         sum = sum + i; 

      return sum; 
   } 
}