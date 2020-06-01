package in.codersclub.j2eedemo.java8.dateandtimeapi;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo
{
	public static void main(String args[])
	{
		LocalTime localTime = null;
		
		localTime = LocalTime.now();
		System.out.println(localTime);
		
		localTime = LocalTime.parse("06:30");
		System.out.println(localTime);
		
		localTime = LocalTime.of(6, 45);
		System.out.println(localTime);
		
		localTime = LocalTime.of(6, 30).plus(2,ChronoUnit.HOURS);
		System.out.println(localTime);
		
	}
}





