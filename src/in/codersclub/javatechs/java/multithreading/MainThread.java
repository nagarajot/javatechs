package in.codersclub.javatechs.java.multithreading;

public class MainThread
{
  public static void main(String args[])
  {
     FirstThread firstThread = new FirstThread();
     SecondThread secondThread = new SecondThread();

     Thread t2 = new Thread(secondThread);
     
     firstThread.start();
     t2.start();
 
     for ( int i = 0; i < 5; i++ )
     {
    	 System.out.println("Main thread");
    	 try
    	 {
    		 Thread.sleep(100);
    	 }
    	 catch(InterruptedException ie)
    	 {
    	 
    	 }
     }

  
  }
}





