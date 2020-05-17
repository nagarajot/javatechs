package in.codersclub.j2eedemo.junit4;

public class Maximum
{
	public static int findMaximum(int a, int b)
	{
		if ( a > b )
			return a;
		else
			return b;
	}
	
	public static int findMaximum(int a, int b, int c)
	{
		if ( a > b && a > c )
			return a;
		if ( b > a && b > c )
			return b;
		return c;
	}
}