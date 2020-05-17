package in.codersclub.javatechs.java.collectionapi;

import java.util.ArrayList;
import java.util.List;

// list preserves the order the insertion
// duplicates are allowed

public class ArrayListDemo
{
	public static void main(String args[])
	{
		List<String> al = new ArrayList<String>();
		
		System.out.println(al.size());
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add(1,"Z");
		
		System.out.println(al.size());
		System.out.println(al);
		
		al.remove("D");
		al.remove("Z");

		System.out.println(al.size());
		System.out.println(al);
	}
}