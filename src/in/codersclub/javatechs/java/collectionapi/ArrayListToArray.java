package in.codersclub.javatechs.java.collectionapi;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray
{
	public static void main(String args[])
	{
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println(al);
		
		Integer ia[] = new Integer[al.size()];
		al.toArray(ia);
		
		// Sum the elements of the array
		int sum = 0;
		
		for ( int i : ia )
			sum += i;
		
		System.out.println("sum = " + sum);
		
	}
}

