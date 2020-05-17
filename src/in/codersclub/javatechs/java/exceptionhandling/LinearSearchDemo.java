package in.codersclub.javatechs.java.exceptionhandling;

import java.util.Scanner;

public class LinearSearchDemo
{
	public static void main(String args[])
	{
	   int n;
	   int x;
	   int[] k = new int[20];

	   Scanner scanner = new Scanner(System.in);
      
	   System.out.println("Enter no of elements in the array : ");
	   n = scanner.nextInt();
   
	   System.out.println("Enter the array elements ...");
	   for ( int i = 0; i < n; i++ )
	   {
		   k[i] = scanner.nextInt();
	   }
      
       System.out.print("Enter the number to be searched : ");
       x = scanner.nextInt();
       
       try
       {
    	   LinearSearch.search(k,x);
    	   System.out.println("key found ...");
       }
       catch(KeyNotFoundException knfe)
       {
    	   System.out.println("Key not found ...");
       }
   	}
}






