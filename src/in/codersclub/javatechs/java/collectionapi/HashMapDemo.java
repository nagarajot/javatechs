package in.codersclub.javatechs.java.collectionapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String,Double> hm = new HashMap<String,Double>();
		
		// Insert the elements into the map
		hm.put("John", 2345.23);
		hm.put("Tom", 123.45);
		hm.put("Tod", 3456.87);
		hm.put("David", 100.34);
		
		
		// Deposit $1000 to John's account
		double balance = hm.get("John");
		hm.put("John", balance + 1000);
		
		System.out.println(hm.get("John"));
	}
}