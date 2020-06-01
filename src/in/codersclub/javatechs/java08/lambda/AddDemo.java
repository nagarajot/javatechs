package in.cdoc.lambda;

public class AddDemo
{
	public static void main(String args[])
	{
		Add add = (int a, int b) ->  {return a + b;}; 
		
		System.out.println(add.add(2, 3));
	}
}

