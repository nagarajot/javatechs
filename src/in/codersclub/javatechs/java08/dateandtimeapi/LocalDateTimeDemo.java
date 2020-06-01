package in.codersclub.j2eedemo.java8.dateandtimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo
{
	public static void main(String args[])
	{
		LocalDateTime localDateTime = null;
		
		localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		localDateTime = LocalDateTime.of(2015,Month.FEBRUARY,25,11,34);
		System.out.println(localDateTime);
		
		localDateTime = LocalDateTime.parse("2015-01-20T06:34:23");
		System.out.println(localDateTime);
	}
}