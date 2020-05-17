package in.codersclub.javatechs.java.sampleprograms;

public class CircleOops
{
 private int radius;

 public CircleOops(int radius)
 {
  this.radius = radius;
 }

 public double findPerimeter() 
 { 
       return ( 2.0 * Math.PI * radius); 
 } 

 public double findArea() 
 { 
       return ( Math.PI * radius * radius ); 
 } 
}

