package in.codersclub.j2eedemo.junit4;

public class ComplexNumberCalculator
{
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber c = new ComplexNumber();
		
		int realPart;
		int imgPart;
		
		realPart = c1.getRealPart() + c2.getRealPart();
		imgPart = c1.getImgPart() + c2.getImgPart();

	    c.setRealPart(realPart);
	    c.setImgPart(imgPart);
	    
	    return c;
	}

	public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber c = new ComplexNumber();
		
		int realPart;
		int imgPart;
		
		realPart = c1.getRealPart() - c2.getRealPart();
		imgPart = c1.getImgPart() - c2.getImgPart();

	    c.setRealPart(realPart);
	    c.setImgPart(imgPart);
	    
	    return c;
	}
}

