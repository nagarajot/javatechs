package in.codersclub.javatechs.exceptions;

public class ProcessingException extends Exception
{
		private String message;
		
		public ProcessingException(String message)
		{
			this.message = message;
		}
		
		public String toString()
		{
			return message;
		}
}