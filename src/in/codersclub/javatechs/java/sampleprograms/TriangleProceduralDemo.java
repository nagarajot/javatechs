package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class TriangleProceduralDemo
{
	public static void main(String ars[])
	{
		int a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();
		
		System.out.println("Perimeter : " + TriangleProcedural.findPerimeter(a,b,c));
		System.out.println("Area      : " + TriangleProcedural.findArea(a,b,c));;
	}
}



