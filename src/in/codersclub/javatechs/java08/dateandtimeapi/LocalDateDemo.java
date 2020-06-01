package in.codersclub.j2eedemo.java8.dateandtimeapi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateDemo
{
	public static void main(String args[])
	{
		LocalDate localDate = null;
		
		localDate = LocalDate.now();
		System.out.println(localDate);
		
		Clock clock = Clock.systemDefaultZone();
		localDate = LocalDate.now(clock);
		System.out.println("clock  : " + localDate);
		
		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
		localDate = LocalDate.now(zoneId);
		System.out.println("ZoneId : " + localDate);
		
		localDate = LocalDate.of(2018, 12, 15);
		System.out.println(localDate);
	}
}

