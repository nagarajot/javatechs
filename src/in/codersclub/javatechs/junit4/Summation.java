package in.codersclub.j2eedemo.junit4;

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

