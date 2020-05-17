package in.codersclub.javatechs.java.multithreading;

public class SecondThreadDemo
{
	public static void main(String args[])
	{
		SecondThread secondThread = new SecondThread();
		Thread thread = new Thread(secondThread);
		thread.start();
		
		for ( int i = 0; i < 5; i++ )
		{
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			System.out.println("Inside main() ...");
		}
	}
}

