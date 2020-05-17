package in.codersclub.javatechs.java.collectionapi;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList
{
	public static void main(String args[])
	{
		String[] names = new String[] {"John","Joseph","Ben","Daniel"};
	
		List<String> nameList = Arrays.asList(names);
		
		for ( String s : names)
		System.out.println(s);
		System.out.println(nameList);
	}
}



