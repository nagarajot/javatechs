package in.codersclub.javatechs.java08.streamapi;

import java.util.stream.IntStream;

public class IntStreamSumExample
{
	public static void main(String args[])
	{
		System.out.println(
		IntStream
			.range(1,10)
			.sum());
		System.out.println();
	}
}

// sum() function