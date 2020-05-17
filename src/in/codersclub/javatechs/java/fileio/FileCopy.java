package in.codersclub.javatechs.java.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCopy
{
    public static void main(String args[])
    {
        InputStreamReader isr = null;
        BufferedReader br = null;
        String srcName = null;
        String dstName = null;

        try
        {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            System.out.print("Source file name : ");
            srcName = br.readLine();

            System.out.print("Destination file name : ");
            dstName = br.readLine();

            fileCopy(srcName,dstName);
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("FileCopy.main() : " + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("FileCopy.main() : " + ioe);
        }
    }

    private static void fileCopy(String srcName, String dstName)
    {
        System.out.println("FileCopy.fileCopy() - entered");

        FileReader fr = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileWriter fw = null;

        String line = null;
        String nl = "\n";

        try
        {
            fr = new FileReader(srcName);
            br = new BufferedReader(fr);
            fw = new FileWriter(dstName);
            bw = new BufferedWriter(fw);

            line = br.readLine();
            while ( line != null )
            {
                System.out.println(line);
                bw.write(line,0,line.length());
                bw.write(nl,0,nl.length());
                line = br.readLine();
            }

            br.close();
            bw.close();

            fr.close();
            fw.close();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("FileCopy.fileCopy() : " + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("FileCopy.fileCopy() : " + ioe);
        }
        System.out.println("FileCopy.fileCopy() - exiting");
    }
}


