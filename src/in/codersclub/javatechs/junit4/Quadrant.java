package in.codersclub.j2eedemo.junit4;

public class Quadrant
{
    public static int findQuandrant(int x, int y)
    {
    	int quadrant;
    	
    	if ( x > 0 && y > 0 ) quadrant = 1;
    	else if ( x < 0 && y > 0 ) quadrant = 2;
    	else if ( x < 0 && y < 0 ) quadrant = 3;
    	else quadrant = 4;

        return quadrant;
    }
}

