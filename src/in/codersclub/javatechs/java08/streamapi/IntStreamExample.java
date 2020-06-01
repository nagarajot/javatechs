package in.codersclub.javatechs.java08.streamapi;

import java.util.stream.IntStream;

public class IntStreamExample
{
	public static void main(String args[])
	{
		IntStream
			.range(1,10)
			.forEach(System.out::println);
	}
}

// IntStream class