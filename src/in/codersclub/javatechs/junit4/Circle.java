package in.codersclub.j2eedemo.junit4;

public class Circle
{

private int radius;

 
 public Circle()
 {
	 
 }
 
 public Circle(int radius)
 {
	 this.radius = radius;
 }

 public int getRadius() {
		return radius;
 }

 public void setRadius(int radius) {
		this.radius = radius;
 }
 
 public double getPerimeter() 
 { 
       return ( 2.0 * Math.PI * radius); 
 } 

 public double getArea() 
 { 
       return ( Math.PI * radius * radius ); 
 } 
}


