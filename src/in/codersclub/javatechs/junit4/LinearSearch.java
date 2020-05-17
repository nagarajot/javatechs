package in.codersclub.j2eedemo.junit4;

public class LinearSearch
{
   public static boolean search(int[] a, int x)
   {
      boolean flag = false;
 
      for ( int i = 0; i < a.length; i++ )
      {
         if ( a[i] == x )
         {
            flag = true;
            break;
         }
      }
 
      return flag;
   }
} 
