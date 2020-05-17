package in.codersclub.javatechs.java.oops;

public class Circle
{
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double findPerimeter()
	{
		return (2 * Math.PI * radius);
	}
	
	public double findArea()
	{
		return (Math.PI * radius * radius);
	}
}


