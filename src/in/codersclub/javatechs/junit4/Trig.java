package in.codersclub.j2eedemo.junit4;

public class Trig
{
	private int a;
	private int b;
	private int c;
	
	public Trig(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Trig()
	{
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public String triangleType()
	{
		if ( a == b && a == c )
			return "Equilateral";
		if ( a == b || b == c || a == c )
			return "Isosceles";
		else 
			return "Scalene";
	}
	
	public boolean isTriangle()
	{
		boolean flag = false;
		
		if ( a > b + c || b > a + c || c > a + b )
			flag = true;
		
		return flag;
	}
}







