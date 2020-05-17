package in.codersclub.javatechs.java.exceptionhandling;

public class LinearSearch
{
   	public static void search(int[] a, int x) throws KeyNotFoundException
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
 
   		if ( flag == false )
   			throw new KeyNotFoundException();
   	}
}

