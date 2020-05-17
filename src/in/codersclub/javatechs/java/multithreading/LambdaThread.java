package in.codersclub.javatechs.java.multithreading;

public class LambdaThread
{
  public static void main(String args[])
  {
	  Runnable r1 = () -> 
	  {
		   try
		   {
			   Thread.sleep(100);
		   }
		   catch(InterruptedException ie)
		   {
			   System.out.println(ie);
		   }
		   for ( int i = 1; i <= 5; i++ )
		   System.out.println("First thread ...");          
	  };
	  
	  Runnable r2 = () -> 
	  {
		   try
		   {
			   Thread.sleep(100);
		   }
		   catch(InterruptedException ie)
		   {
			   System.out.println(ie);
		   }
		   for ( int i = 1; i <= 5; i++ )
		   System.out.println("Second thread ...");          
	  };
	  
     Thread t1 = new Thread(r1);  
     Thread t2 = new Thread(r2);
     
     t1.start();
     t2.start();
  }
}








