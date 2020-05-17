package in.codersclub.j2eedemo.junit4;

public class SumOfSquares
{
	public static int findSumOfSquares(int n)
	{
	      int sum = 0; 

	      for ( int i = 1; i <= n; i++ ) 
	         sum = sum + i * i; 

	      return sum; 

	}
}


