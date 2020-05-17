package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class LineDemo
{
 public static void main(String args[])
 {
        int x1,y1;
        int x2,y2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the coordinates of first point ...");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        
        Point p1 = new Point(x1,y1);
        
        System.out.println("Enter the coordinates of second point ...");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        scanner.close();
        
        Point p2 = new Point(x2,y2);
        
        Line line = new Line(p1,p2);
        
        System.out.println("Length of line = " + line.findLength());
 }
}