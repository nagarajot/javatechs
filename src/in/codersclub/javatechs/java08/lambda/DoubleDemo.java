package in.cdoc.lambda;

import in.cdoc.lambda.MyDouble;

public class DoubleDemo
{
	public static void main(String args[])
	{
		MyDouble d = (int a) -> {return  (a * 2);};

		System.out.println(d.getDouble(5));
	}
}





