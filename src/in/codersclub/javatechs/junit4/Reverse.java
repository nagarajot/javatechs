package in.codersclub.j2eedemo.junit4;

public class Reverse
{
   public static String reverse(String s)
   {
      int l = s.length();
      StringBuffer returnValue = new StringBuffer();
 
      for (int i = 0; i < l; i++ )
      {
         returnValue.append(s.charAt(l-i-1));
      }
      return returnValue.toString();
   }
}


