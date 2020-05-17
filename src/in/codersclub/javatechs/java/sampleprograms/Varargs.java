package in.codersclub.javatechs.java.sampleprograms;

public class Varargs
{
    public static void main(String args[])
    {
        // Prior to JDK 5.0
        display("One");
        display("Two","Three");
        display("Four","Five","Six");

        // JDK 5.0
        String[] records =   {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        display(records);
    }

    private static void display(String s1)
    {
        System.out.println(s1);
    }

    private static void display(String s1, String s2)
    {
        System.out.println(s1 + "," + s2);
    }

    private static void display(String s1, String s2, String s3)
    {
        System.out.println(s1 + "," + s2 + "," + s3);
    }

    private static void display(String... records)
    {
        for ( String record : records)
            System.out.println(record);
    }
}




