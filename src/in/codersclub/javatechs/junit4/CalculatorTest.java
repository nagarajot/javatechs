package in.codersclub.j2eedemo.junit4;

public class CalculatorTest
{
	public boolean testAdd()
	{
		if ( Calculator.add(3,4) == 7 && Calculator.add(-3, -8) == -11 ) return true;
		return false;
	}
	
	public boolean testSub()
	{
		if ( Calculator.sub(10,4) == 6 && Calculator.sub(7, 2) == 5 ) return true;
		return false;
	}
	
	public boolean testMultiply()
	{
		if ( Calculator.multiply(3,4) == 12 && Calculator.multiply(-3, 5) == -15 ) return true;
		return false;
	}
	
	public boolean testDivide()
	{
		if ( Calculator.divide(12,4) == 3 && Calculator.divide(-20, -5) == 4 ) return true;
		return false;
	}
	
	public boolean testModulo()
	{
		if ( Calculator.modulo(12,5) == 2 && Calculator.modulo(20, 6) == 2 ) return true;
		return false;
	}
}





