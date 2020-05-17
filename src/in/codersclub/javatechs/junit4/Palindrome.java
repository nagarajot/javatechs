package in.codersclub.j2eedemo.junit4;

public class Palindrome
{
   public static boolean isPalindrome(String s)
   {
      boolean flag = true;
      String s1 = s;
      int l = s.length();
 
      for ( int i = 0; i < l/2; i++ )
      {
         if ( s.charAt(i) != s1.charAt(l-i-1))
         { 
            flag = false;
            break;
         }
      }
      return flag;
   }
} 

