package in.codersclub.javatechs.java08.streamapi;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MoviesExample
{
	public static void main(String args[]) throws Exception
	{
		
		Stream<String> movies = Files.lines(Paths.get("src/in/codersclub/javatechs/java08/streamapi/movies.txt"));
		movies
		.sorted()
		.filter(x->x.length() > 15)
		.forEach(System.out::println);
		
		movies.close();
		
	}
}




