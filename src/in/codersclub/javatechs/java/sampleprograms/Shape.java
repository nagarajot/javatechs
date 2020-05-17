package in.codersclub.javatechs.java.sampleprograms;

public abstract class Shape
{
	protected String color;
 
	abstract public double perimeter();
	abstract public double area();
 
	public void setColor(String color)
	{ 
		this.color = color;
	}
 
	public String getColor()
	{
		return this.color;
	}
}

