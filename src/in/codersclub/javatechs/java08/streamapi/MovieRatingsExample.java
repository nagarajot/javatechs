package in.codersclub.javatechs.java08.streamapi;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MovieRatingsExample 
{
	public static void main(String args[]) throws Exception
	{
		Stream<String> rows = Files.lines(Paths.get("src/in/codersclub/javatechs/java08/streamapi/movie_ratings.txt"));
		int rowCount = (int)rows
				.map(x->x.split(","))
				.filter(x->x.length == 3)
				.count();
		System.out.println("count = " + rowCount);
		rows.close();
	}
}




