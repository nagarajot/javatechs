package in.codersclub.j2eedemo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateArithmetic
{
	public static String addDays(String date, int n)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try{
			//Setting the date to the given date
			c.setTime(sdf.parse(date));
		}catch(ParseException e){
			e.printStackTrace();
		}
	   
		//Number of Days to add
		c.add(Calendar.DAY_OF_MONTH, n);  

		String newDate = sdf.format(c.getTime());  
		return newDate;
	}
}


