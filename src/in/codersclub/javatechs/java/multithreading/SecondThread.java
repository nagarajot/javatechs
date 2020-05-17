package in.codersclub.javatechs.java.multithreading;

public class SecondThread implements Runnable
{
	@Override
	public void run()
	{
		for ( int i = 1; i <= 5; i++ )
		{
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
			    System.out.println(ie);	
			}
			System.out.println("Inside SecondThread.run() ...");
			
		}
	}
}