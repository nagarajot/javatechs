package in.codersclub.javatechs.java.multithreading;

public class MyThread implements Runnable
{
	String name;
	Thread t;
	
	public MyThread(String name)
	{
		this.name = name;
		t = new Thread(this, name);
		System.out.println("Thread : " + t);
		t.start();
	}
	
	@Override
	public void run()
	{
		for ( int i = 0; i < 5; i++ )
		{
			System.out.println(name + "-" + i);
			 try
			 {
				 Thread.sleep(200);
			 }
			 catch(InterruptedException ie)
			 {
				 
			 }
		}
	}
}