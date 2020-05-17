package in.codersclub.javatechs.java.multithreading;

public class FirstThreadDemo
{
	public static void main(String args[])
	{
		FirstThread firstThread = new FirstThread();
		firstThread.start();
		
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
			System.out.println("Inside main()");
		}
	}
}