package in.codersclub.javatechs.java.sampleprograms;

public class Prime
{
 public static boolean isPrime(int n)
 {
  for ( int i = 2; i < n; i++ )
   if ( n % i == 0 ) return false;
  return true;
 }
}


