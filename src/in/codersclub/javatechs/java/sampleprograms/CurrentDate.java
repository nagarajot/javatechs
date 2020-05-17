package in.codersclub.javatechs.java.sampleprograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate
{
   public static String findCurrentDate(String pattern)
   {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
      return simpleDateFormat.format(new Date());
   }
}


