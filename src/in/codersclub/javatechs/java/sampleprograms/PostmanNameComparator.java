package in.codersclub.javatechs.java.sampleprograms;

import java.util.Comparator;

public class PostmanNameComparator  implements Comparator<Postman>{
    @Override
    public int compare(Postman p1, Postman p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}


