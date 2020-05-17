package in.codersclub.javatechs.java.sampleprograms;

import java.util.Scanner;

public class ComplexNumberOperationsDemo
{
	public static void main(String args[])
	{
        ComplexNumber c1,c2,c3,c4;
        int realPart, imgPart;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the rela part and img part of frist complex number ...");
        realPart = scanner.nextInt();
        imgPart = scanner.nextInt();
        
        c1 = new ComplexNumber(realPart,imgPart);
   
        System.out.println("Enter the real part and img part of second complex number ...");        
        realPart = scanner.nextInt();
        imgPart = scanner.nextInt();
        scanner.close();
        
        c2 = new ComplexNumber(realPart,imgPart);
        
        c3 = ComplexNumberOperations.add(c1, c2);
        System.out.println(c3);
        
        c4 = ComplexNumberOperations.sub(c1, c2);
        System.out.println(c4);
	}
}

