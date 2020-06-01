package in.codersclub.javatechs.java08.streamapi;

import java.util.Arrays;

public class AverageOfSquares
{
	public static void main(String args[]) 
	{
		Arrays.stream(new int[] { 1,2,3,4,5 })
		.map(x -> x*x)
		.average()
		.ifPresent(System.out::println);
	}
	
	
}