package in.codersclub.javatechs.java.collectionapi;

import java.util.ArrayList;

public class ForEachDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(20);
		
		// iterate using for each loop
		for ( int i   : al )
			System.out.println(i);
	}
}