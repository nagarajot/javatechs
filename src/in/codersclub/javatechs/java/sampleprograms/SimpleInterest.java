package in.codersclub.javatechs.java.sampleprograms;

public class SimpleInterest
{
 public static float findSimpleInterest(int principle, int term, int rateOfInterest)
 {
  float interest;
  
  interest = (principle * term * rateOfInterest ) / (float) 100.0;
  
  return interest;
 }
}


