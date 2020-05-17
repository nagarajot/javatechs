package in.codersclub.javatechs.java.sampleprograms;

public class Triangle extends Shape
{
	private int a;
	private int b;
	private int c;
 
	public Triangle(int a, int b, int c, String color)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.color = color;
	}
 
	@Override
	public double perimeter()
	{
		return (a + b + c);
	}
 
	@Override
	public double area()
	{
		double s = ( a + b + c ) / 2.0;
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		return area;
	}
}

