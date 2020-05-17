package in.codersclub.j2eedemo.junit4;

public class SimpleInterest
{
	public static double findSimpleInterest(int principle, int term, int rateOfInterest)
	{
		double interest = 0.0;
		
		interest = ( principle * term * rateOfInterest ) / 100.0;
		
		
		return interest;
	}
}




