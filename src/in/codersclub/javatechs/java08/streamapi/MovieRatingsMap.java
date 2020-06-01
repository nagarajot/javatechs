package in.codersclub.javatechs.java08.streamapi;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieRatingsMap
{
	public static void main(String args[]) throws Exception
	{
		Stream<String> rows = Files.lines(Paths.get("src/in/codersclub/javatechs/java08/streamapi/movie_ratings.txt"));
		Map<String, Double> map = new HashMap<>();
		map = rows
				.map(x->x.split(","))
				.filter(x->x.length == 3)
				.filter(x->Double.parseDouble(x[1]) > 4.0)
				.collect(Collectors.toMap(
						x->x[0],
						x->Double.parseDouble(x[1])
						));
		rows.close();
		
		for ( String key : map.keySet())
			System.out.println(key + " " + map.get(key));
	}
}




