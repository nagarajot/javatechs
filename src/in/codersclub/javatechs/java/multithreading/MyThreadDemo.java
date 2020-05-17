package in.codersclub.javatechs.java.multithreading;

public class MyThreadDemo
{
	public static void main(String args[])
	{
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		MyThread t3 = new MyThread("Three");
		
		System.out.println("Main thread terminating");
		
	}
}