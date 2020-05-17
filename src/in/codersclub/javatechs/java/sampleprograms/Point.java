package in.codersclub.javatechs.java.sampleprograms;

public class Point
{
     private int x;
     private int y;
     
     public Point(int x, int y) {
    	 super();
    	 this.x = x;
    	 this.y = y;
     }

     public int getX() {
    	 return x;
     }

     public void setX(int x) {
    	 this.x = x;
     }

     public int getY() {
    	 return y;
     }

     public void setY(int y) {
    	 this.y = y;
     }
 
     public int findQuandrant()
     {
    	 int quadrant;
     
    	 if ( x > 0 && y > 0 ) quadrant = 1;
    	 else if ( x < 0 && y > 0 ) quadrant = 2;
    	 else if ( x < 0 && y < 0 ) quadrant = 3;
    	 else quadrant = 4;

        return quadrant;
    }
}


