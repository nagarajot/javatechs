package in.codersclub.j2eedemo.java8.streamapi;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStreamExample
{
	public static void main(String args[])
	{
		Stream.of("Xavier","John","Rita","Ben")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
	}
}