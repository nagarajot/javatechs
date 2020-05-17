package in.codersclub.javatechs.java.exceptionhandling;

public class SuperSubCatch
{
	public static void main(String args[])
	{
		try
		{
			int a = 0;
			int b = 42/a;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(Exception e)
		{
			System.out.println("Generic exception caught");
		}

	}
}

/*
 * The second catch statement will never be executed.
 * The program results in compile time error.
 * 
 * 
*/

/*
Sat - 3.00 pm
Mon - 3.00 Pm
Tue - 3.00 pm
Wed - 3.00 pm
*/



