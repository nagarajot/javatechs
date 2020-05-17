package in.codersclub.javatechs.java.sampleprograms;

public class ComplexNumberOperations
{
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber c = new ComplexNumber();
  
		int realPart;
		int imaginaryPart;
  
		realPart = c1.getRealPart() + c2.getRealPart();
		imaginaryPart = c1.getImaginaryPart() + c2.getImaginaryPart();

		c.setRealPart(realPart);
		c.setImaginaryPart(imaginaryPart);
     
		return c;
	}

	public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber c = new ComplexNumber();
  
		int realPart;
		int imaginaryPart;
  
		realPart = c1.getRealPart() - c2.getRealPart();
		imaginaryPart = c1.getImaginaryPart() - c2.getImaginaryPart();

		c.setRealPart(realPart);
		c.setImaginaryPart(imaginaryPart);
     
		return c;
	}
}

