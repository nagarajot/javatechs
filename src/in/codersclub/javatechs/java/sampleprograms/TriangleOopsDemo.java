package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class TriangleOopsDemo
{
	public static void main(String ars[])
	{
		int a,b,c;
		TriangleOops t;
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		scanner.close();
		
		t = new TriangleOops(a,b,c);
		
		System.out.println("Perimeter : " + t.findPerimeter());
		System.out.println("Area      : " + t.findArea());;
	}
}



