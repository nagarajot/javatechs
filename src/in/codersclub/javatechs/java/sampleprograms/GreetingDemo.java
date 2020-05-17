package in.codersclub.javatechs.java.sampleprograms;

public class GreetingDemo
{
	public static void main(String args[])
	{
		Greeting greeting;
		
		greeting = new Morning();
		System.out.println(greeting.greet());
		
		greeting = new Evening();
		System.out.println(greeting.greet());

		greeting = new Night();
		System.out.println(greeting.greet());

	}
}