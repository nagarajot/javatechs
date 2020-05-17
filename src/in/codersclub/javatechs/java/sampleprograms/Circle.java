package in.codersclub.javatechs.java.sampleprograms;

public class Circle extends Shape
{
	private int radius;
 
	public Circle(int radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
 
	@Override
	public double perimeter()
	{
		return ( 2.0 * Math.PI * radius );
	}
 
	@Override
	public double area()
	{
		return ( Math.PI * radius * radius );
	}
}

