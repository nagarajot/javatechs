package in.codersclub.j2eedemo.java8.lambda;

public class HelloWorld
{
	public static void main(String args[])
	{
		HelloWorldInt x = (s) -> System.out.println(s);
		x.say("Hi to Lammda");
	}
	
	@FunctionalInterface
	interface HelloWorldInt
	{
		void say(String s);
	}
}




