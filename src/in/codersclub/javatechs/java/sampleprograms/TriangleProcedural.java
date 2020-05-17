package in.codersclub.javatechs.java.sampleprograms;

public class TriangleProcedural
{
	
	public static int findPerimeter(int a, int b, int c)
	{
		return ( a +b + c );
	}
	
	public static double findArea(int a, int b, int c)
	{
		double s = (a + b + c ) / 2.0;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
}



