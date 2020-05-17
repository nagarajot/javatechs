package in.codersclub.javatechs.java.collectionapi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEg
{
 public static void main(String args[])
 {
	 Map<Integer,String> map = new HashMap<Integer,String>();
 
	 map.put(1,"One");
	 map.put(2,"Two");
	 map.put(3,"Three");
	 map.put(4,"Four");
	 map.put(5,"Five");

	 Collection c = map.values();

	 Iterator itr = c.iterator();

	 while(itr.hasNext())
		 System.out.println(itr.next());
 

	 System.out.println("-------------");
	 System.out.println(map.get(3));
 	}
}


