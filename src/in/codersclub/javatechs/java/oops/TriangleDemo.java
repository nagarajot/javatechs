package in.codersclub.javatechs.java.oops;

import java.util.Scanner;

public class TriangleDemo
{
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 sides of triangle : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();
		
		Triangle triangle = new Triangle(a,b,c);
		
		System.out.println("Perimeter = " + triangle.findPerimeter());
		System.out.println("Area      = " + triangle.findArea());
	}
}