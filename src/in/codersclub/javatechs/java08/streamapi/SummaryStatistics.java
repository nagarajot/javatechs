package in.codersclub.javatechs.java08.streamapi;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatistics
{
	public static void main(String args[])
	{
		IntSummaryStatistics summary = IntStream.of(3,6,8,9,12,5)
			.summaryStatistics();
		
		System.out.println(summary);
	}
}