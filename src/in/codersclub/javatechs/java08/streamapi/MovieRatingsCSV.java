package in.codersclub.javatechs.java08.streamapi;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MovieRatingsCSV
{
	public static void main(String args[]) throws Exception
	{
		Stream<String> rows = Files.lines(Paths.get("src/in/codersclub/javatechs/java08/streamapi/movie_ratings.txt"));
		rows
				.map(x->x.split(","))
				.filter(x->x.length == 3)
				.filter(x->Double.parseDouble(x[1]) > 4.0)
				.forEach(x->System.out.println(x[0] + " " + x[1] + " " + x[2]));
		rows.close();
	}
}




