package in.codersclub.javatechs.java08.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamFromArraysExample
{
	public static void main(String args[])
	{
		String[] names = { "Xavier", "John", "Richard", "Ben", "Joseph" };
		Arrays.stream(names)
			.filter(x->x.startsWith("J"))
			.sorted()
			.forEach(System.out::println);;
	}
}