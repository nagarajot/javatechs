package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class CircleOopsDemo
{
	public static void main(String args[])
	{
		int radius;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		radius = scanner.nextInt();
		scanner.close();
		
		CircleOops circle = new CircleOops(radius);
		
		System.out.println("Perimeter = " + circle.findPerimeter());
		System.out.println("Area      = " + circle.findArea());
		
	}
}