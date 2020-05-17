package in.codersclub.javatechs.java.oops;

public class Triangle
{
	private int a,b,c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int findPerimeter()
	{
		return (a+b+c);
	}
	
	public double findArea()
	{
		double s = (a+b+c)/2.0;
		
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		return area;
	}
	
}