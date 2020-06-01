package in.codersclub.javatechs.java08.streamapi;

import java.util.stream.Stream;

public class ReduceExample
{
	public static void main(String args[])
	{
		double total = Stream.of(1.2, 3.4, 6.7, 8.2)
				.reduce(0.0, (Double a, Double b) -> a+b);
		System.out.println("total = " + total);
	}
}