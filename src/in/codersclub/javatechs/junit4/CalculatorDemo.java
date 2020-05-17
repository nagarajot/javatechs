package in.codersclub.j2eedemo.junit4;

public class CalculatorDemo
{
	public static void main(String args[])
	{
		CalculatorTest ct = new CalculatorTest();
		
		if ( ct.testAdd()) 
			System.out.println("testAdd() : Passed");
		else
			System.out.println("testAdd() : Failed");
		
		if ( ct.testSub()) 
			System.out.println("testSub() : Passed");
		else
			System.out.println("testSub() : Failed");

		if ( ct.testMultiply()) 
			System.out.println("testMultiply() : Passed");
		else
			System.out.println("testMultiply() : Failed");

		if ( ct.testDivide()) 
			System.out.println("testDivide() : Passed");
		else
			System.out.println("testDivide() : Failed");
		
		if ( ct.testModulo()) 
			System.out.println("testModulo() : Passed");
		else
			System.out.println("testModulo() : Failed");
	}
}

