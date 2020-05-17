package in.codersclub.j2eedemo.java8.streamapi;

import java.util.stream.IntStream;

public class IntStreamSkipExample
{
	public static void main(String args[])
	{
		IntStream
			.range(1,15)
			.skip(3)   // skip up to 3
			.forEach(x->System.out.println(x));
		System.out.println();
	}
}