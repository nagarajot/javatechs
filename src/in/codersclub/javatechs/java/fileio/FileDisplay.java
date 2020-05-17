package in.codersclub.javatechs.java.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDisplay
{
    public static void main(String args[])
    {
        InputStreamReader isr = null;
        BufferedReader br = null;
        String fileName = null;

        try
        {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            System.out.print("File name : ");
            fileName = br.readLine();
            fileDisplay(fileName);
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("FileDisplay.main() : " + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("FileDisplay.main() : " + ioe);
        }
    }

    // Note that this method is private and static
    private static void fileDisplay(String fileName)
    {
        System.out.println("FileDisplay.fileDisplay() - entered");

        FileReader fr = null;
        BufferedReader br = null;
        String line = null;

        try
        {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            line = br.readLine();
            while ( line != null )
            {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("FileDisplay.fileDisplay() : " + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("FileDisplay.fileDisplay() : " + ioe);
        }
        System.out.println("FileDisplay.fileDisplay() - exiting");
    }
}

