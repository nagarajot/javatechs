package in.codersclub.javatechs.java.sampleprograms;

public class Maximum 
{ 
   public static int findMaximum(int m, int n) 
   { 
      if ( m > n ) 
         return m; 
      else 
         return n; 
   } 

   public static int findMaximum(int m, int n, int o) 
   { 
      int max = 0; 

      if ( m > n && m > 0 ) max = m; 
      if ( n > m && n > 0 ) max = n; 
      if ( o > m && o > n ) max = o; 

      return max; 
   } 
}

