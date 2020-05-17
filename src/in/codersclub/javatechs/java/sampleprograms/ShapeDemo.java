package in.codersclub.javatechs.java.sampleprograms;

public class ShapeDemo 
{
	public static void main(String args[])
	{
		Shape shape;
  
		shape = new Triangle(3,4,5, "Red");
		System.out.println("Perimeter of triangle : " + shape.perimeter());
		System.out.println("Area of triangle      : " + shape.area() );
		System.out.println("Color of triangle     : " + shape.getColor());
  
		shape = new Circle(4,"Blue");
		System.out.println("Perimeter of circle : " + shape.perimeter());
		System.out.println("Area of circle      : " + shape.area() );
		System.out.println("Color of circle     : " + shape.getColor());
	}
}

