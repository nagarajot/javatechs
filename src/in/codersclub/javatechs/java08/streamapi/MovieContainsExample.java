package in.codersclub.javatechs.java08.streamapi;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class MovieContainsExample
{
	public static void main(String args[]) throws Exception
	{
		List<String> movies = Files.lines(Paths.get("src/in/codersclub/javatechs/java08/streamapi/movies.txt"))
		.filter(x->x.contains("dar"))
		.collect(Collectors.toList());
		
		movies.forEach(x->System.out.println(x));
		

	}
}

