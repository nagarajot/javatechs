package in.codersclub.javatechs.java.oops;

import java.util.Scanner;

public class CircleDemo
{
	public static void main(String args[])
	{
		int radius;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		radius = scanner.nextInt();
		scanner.close();
		
		Circle circle = new Circle(radius);
		
		System.out.println("Perimeter : " + circle.findPerimeter());
		System.out.println("Area      : " + circle.findArea());
		
		
		
	}
}