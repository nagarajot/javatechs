package in.codersclub.javatechs.java08.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// stream represents a sequence of objects from a source
// sequence may be created from list, array etc
// supports aggregate operations filter, collect, map etc
// most of the stream operations returns stream
// collect method is a terminal operation
// automatic iteration or implicit iteration over the elements


// java.util.stream package
// java.utilstream.Stream class

public class StreamCreate
{
	public static void main(String args[])
	{
		// stream creation from array
		String[] names = new String[] {"John", "Rita", "Xavier", "Mark"};
		Stream<String> stream1 = Arrays.stream(names);
		stream1.forEach(System.out::println);

		System.out.println("---------------");
		
		Stream stream2 = Stream.of("Rita","Ann","Rosy","Kathy");
		stream2.forEach(System.out::println);
		
		System.out.println("---------------");
		
		List<String> l = new ArrayList<>();
		l.add("Robert");
		l.add("Foster");
		l.add("George");
		
		Stream<String> stream3 = l.stream();
		stream3.forEach(System.out::println);
	}
}




