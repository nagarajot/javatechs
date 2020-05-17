package in.codersclub.javatechs.java.sampleprograms;

public class Line
{
	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
 
    public float findLength()
    {
    	float distance;
    	double temp;
     
    	int x1,y1;
    	int x2,y2;
          
    	x1 = p1.getX();
    	y1 = p1.getY();
     
    	x2 = p2.getX();
    	y2 = p2.getY();
     
    	temp = Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2);
    	distance = (float) Math.sqrt(temp);
     
    	return distance;
    }
}



