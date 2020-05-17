package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class LinearSearch
{
   public static void main(String args[])
   {
	   int n;
	   int x;
	   int[] k = new int[20];

	   Scanner scanner = new Scanner(System.in);
      
	   System.out.println("Enter no of elements in the array : ");
	   n = scanner.nextInt();
   
	   System.out.println("nter the array elements ...");
	   for ( int i = 0; i < n; i++ )
	   {
		   System.out.println("k[" + i + "] : ");
		   k[i] = scanner.nextInt();
	   }
      
       System.out.print("Enter the number to be searched : ");
       x = scanner.nextInt();
       
       if ( search(k,n))
            System.out.println("found ...");
       else
            System.out.println("not found ...");
   	}
 
   	private static boolean search(int[] a, int x)
   	{
   		boolean flag = false;
 
   		for ( int i = 0; i < a.length; i++ )
   		{
   			if ( a[i] == x )
   			{
   				flag = true;
   				break;
   			}
   		}
 
   		return flag;
   	}
}

