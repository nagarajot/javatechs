package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class CircleProceduralDemo
{
	public static void main(String args[])
	{
		int radius;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		radius = scanner.nextInt();
		scanner.close();
		
		System.out.println("Perimeter = " + CircleProcedural.findPerimeter(radius));
		System.out.println("Area      = " + CircleProcedural.findArea(radius));
		
	}
}



