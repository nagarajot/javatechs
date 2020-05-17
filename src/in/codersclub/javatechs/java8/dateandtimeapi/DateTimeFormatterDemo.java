package in.codersclub.j2eedemo.java8.dateandtimeapi;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterDemo
{
	public static void main(String args[])
	{
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.AUGUST, 26, 6,35);
		System.out.println(localDateTime);
		
		String format = null;
		format = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println(format);
		
		format = localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(format);
		
		format = localDateTime
				.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
			.withLocale(Locale.UK));
				
	}
}


















