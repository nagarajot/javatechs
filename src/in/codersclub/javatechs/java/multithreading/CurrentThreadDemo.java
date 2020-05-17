package in.codersclub.javatechs.java.multithreading;

public class CurrentThreadDemo
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		// Change the name of the thread
		t.setName("myThread");
		
		// Change priority
		t.setPriority(7);
		
		System.out.println(t);
		
		System.out.println("Main thread terminates");
	}
}

/*
 * name, priority, main
 * main, 5, main
 */

