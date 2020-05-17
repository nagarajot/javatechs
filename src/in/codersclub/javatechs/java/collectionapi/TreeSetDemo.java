package in.codersclub.javatechs.java.collectionapi;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo
{
	public static void main(String args[])
	{
		Set<String> ts = new TreeSet<String>();
		
		ts.add("E");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		ts.add("A");
		
		System.out.println(ts);
	}
}