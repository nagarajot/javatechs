package in.cdoc.lambda;

import in.cdoc.lambda.Greeting;

public class GreetingDemo
{
    public static void main(String args[]){
	    Greeting g = () -> "Hello";
	    
	    System.out.println(g.sayHello());
    }
}