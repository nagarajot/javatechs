package in.codersclub.j2eedemo.junit4;

public class Average 
{ 

	public static float findAverage(int a[])
	{
	  float av;
	  int sum = 0;
	  for ( int i = 0; i < a.length; i++ ) 
      { 
            sum = sum + a[i]; 
      } 
 
      av = sum / a.length; 
      return av;
	} 
} 


