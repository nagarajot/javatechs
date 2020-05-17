package in.codersclub.j2eedemo.junit4;

public class ComplexNumber
{
	private int realPart;
	private int imgPart;

	public ComplexNumber()
	{
		
	}
	
	public ComplexNumber(int realPart, int imgPart) {
		super();
		this.realPart = realPart;
		this.imgPart = imgPart;
	}
	public int getRealPart() {
		return realPart;
	}
	public void setRealPart(int realPart) {
		this.realPart = realPart;
	}
	public int getImgPart() {
		return imgPart;
	}
	public void setImgPart(int imgPart) {
		this.imgPart = imgPart;
	}
	
	
}