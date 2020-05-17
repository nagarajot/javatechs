package in.codersclub.javatechs.java.inheritance;

public class MultilevelInheritance
{
	public static void main(String args[])
	{
		B1 b1 = new B1();
		B2 b2 = new B2();
		B3 b3 = new B3();
		
		b1.m1();
		
		System.out.println("-----");
		
		b2.m1();
		b2.m2();
		
		System.out.println("-----");
		
		b3.m1();
		b3.m2();
		b3.m3();
	}
}



