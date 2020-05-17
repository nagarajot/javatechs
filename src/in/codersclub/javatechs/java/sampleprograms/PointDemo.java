package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class PointDemo
{
	public static void main(String args[])
	{
		int x,y;
  
		Scanner scanner = new Scanner(System.in);
  
		System.out.println("Enter the coordinates of a point ...");
		x = scanner.nextInt();
		y = scanner.nextInt();
		scanner.close();
  
		Point p = new Point(x,y);
  
		System.out.println("Quadrant : " + p.findQuandrant());
	}
}

