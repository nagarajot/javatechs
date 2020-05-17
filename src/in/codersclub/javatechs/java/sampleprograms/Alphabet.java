package in.codersclub.javatechs.java.sampleprograms;

public class Alphabet
{
   public static void main(String args[])
   {
      printAlphabets('a','z');
      printAlphabets('A','Z');
   }

   private static void printAlphabets(int a, int b)
   {
      for ( int i = 0; i < 128; i++ )
         if ( i >= a && i <= b )
            System.out.println((char)i);
   }
}


