package in.codersclub.j2eedemo.samples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class AddDays
{
	public static void main(String args[]){
		//Given Date in String format
		String date = null;
		
		System.out.println("Enter the date (YYYY-MM-DD) : ");
		Scanner scanner = new Scanner(System.in);
		
		date = scanner.next();
		
		System.out.println("Enter no of days to add : ");
		int n = scanner.nextInt();
		
		String newDate = addDays(date, n);
		
		System.out.println(newDate);
	}
	
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




