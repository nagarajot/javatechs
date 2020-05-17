package in.codersclub.javatechs.java.exceptionhandling;

import in.codersclub.javatechs.java.exceptionhandling.FirstException;
import in.codersclub.javatechs.java.exceptionhandling.SecondException;
import in.codersclub.javatechs.java.exceptionhandling.ThirdException;

public class MultiCatch1
{
	public static void main(String args[])
	{
		try
		{
			m(2);
		}
		catch(FirstException | SecondException  | ThirdException e)
		{
			System.out.println(e);
		}
	}

	public static void m(int n) throws 
	FirstException, SecondException, ThirdException
	{
 		if ( n == 1 ) throw new FirstException();
		if ( n == 2 ) throw new SecondException();
		if ( n == 3 ) throw new ThirdException(); 
	}
}

