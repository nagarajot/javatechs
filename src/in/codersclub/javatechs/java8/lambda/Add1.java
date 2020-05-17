package in.codersclub.j2eedemo.java8.lambda;

public class Add
{
	public static void main(String args[])
	{
		AddInt fn = (int p, int q) -> p+q;
		System.out.println(fn.add(2,3));
	}
	
	
	@FunctionalInterface
	interface AddInt
	{
		public int add(int a, int b);
	}
}