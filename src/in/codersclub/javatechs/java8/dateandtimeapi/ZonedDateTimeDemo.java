package in.codersclub.j2eedemo.java8.dateandtimeapi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;

public class ZonedDateTimeDemo
{
	public static void main(String args[])
	{
		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
		LocalDate localDate = LocalDate.now(zoneId);
		System.out.println(localDate);
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		
		for ( String s : availableZoneIds )
			System.out.println(s);
	}
}


