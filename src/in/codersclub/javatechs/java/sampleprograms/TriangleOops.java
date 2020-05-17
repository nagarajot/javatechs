package in.codersclub.javatechs.java.sampleprograms;

public class TriangleOops
{
	private int a;
	private int b;
	private int c;
	
	public TriangleOops(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int findPerimeter()
	{
		return ( a +b + c );
	}
	
	public double findArea()
	{
		double s = (a + b + c ) / 2.0;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
}



