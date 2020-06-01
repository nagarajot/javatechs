package in.codersclub.javatechs.java08.streamapi;

import java.util.Arrays;
import java.util.List;

public class StartsWithExample
{
	public static void main(String args[])
	{
		List<String> people = Arrays.asList("John","Rita","Bob","Mark","Xavier","David","Joseph");
		people
			.stream()
			.map(String::toLowerCase)
			.filter(x->x.startsWith("j"))
			.forEach(System.out::println);
	
	}
}



