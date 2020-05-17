package in.codersclub.javatechs.java.sampleprograms;

public class ComplexNumber
{
	private int realPart;
	private int imaginaryPart;

	public ComplexNumber()
	{
    
	}
   
	public ComplexNumber(int realPart, int imaginaryPart) {
		super();
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public void setRealPart(int realPart)
	{
		this.realPart = realPart;
	}

	public void setImaginaryPart(int imaginaryPart)
	{
		this.imaginaryPart = imaginaryPart;
	}

	public int getRealPart()
	{
		return realPart;
	}	

	public int getImaginaryPart()
	{
		return imaginaryPart;
	}
   
	@Override
	public String toString()
	{
		return "" + realPart + "+i" + imaginaryPart; 
	}
} 

