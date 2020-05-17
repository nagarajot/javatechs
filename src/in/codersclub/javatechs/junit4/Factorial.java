package in.codersclub.j2eedemo.junit4;

public class Factorial 
{ 
   public static int findFactorial(int n) 
   { 
      int i, fact; 
      fact = 1;

      for ( i = 1; i <= n; i++ ) 
       fact = fact * i;

      return fact; 
   } 
} 

