package in.codersclub.javatechs.java.sampleprograms;

public class DisplayMessage
{
	public static void display(String s)
	{
		System.out.println("Welcome to " + s);
	}
	
	public static void display(String s, int n)
	{
		for ( int i = 1; i <= n; i++ )
			System.out.println("Welcome to " + s);
	}
	
	public static void display(int n, String s)
	{
		for ( int i = 1; i <= n; i++ )
			System.out.println("Welcome to " + s);
	}
}





