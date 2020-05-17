package in.codersclub.javatechs.java.exceptionhandling;

public class MultiCatch
{
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			System.out.println("a = "+ a);
		
			int b = 42/a;
		
			int c[] = {1};
			c[47] = 99;
		} 
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException aiofbe)
		{
			System.out.println(aiofbe);
		}
		System.out.println("After try/catch block");
	}
}

/*
     java MultiCatch
     a = 0
     ArithmeticException
     
     java MultiCatch TestArgs
     a = 1
     ArrayIndexOutOfBoundsException
*/



