package in.codersclub.j2eedemo.java8.lambda;

public class Double
{
	public static void main(String args[])
	{
		DoubleInt x = (p) -> 2 *p;
		System.out.println(x.doub(4));
		
	}
	
	
	@FunctionalInterface
	interface DoubleInt
	{
		int doub(int a);
	}
}