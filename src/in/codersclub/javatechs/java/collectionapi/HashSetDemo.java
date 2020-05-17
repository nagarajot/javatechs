package in.codersclub.javatechs.java.collectionapi;

import java.util.HashSet;

// duplicates are not allowed in set
public class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		hs.add("C");
		
		System.out.println(hs);
		
	}
}



