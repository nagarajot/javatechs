package in.codersclub.javatechs.java.sampleprograms;

import java.util.Comparator;

public class PostmanAgeComparator  implements Comparator<Postman>{
    @Override
    public int compare(Postman p1, Postman p2)
    {
    	int age1 = p1.getAge();
    	int age2 = p2.getAge();
    	
    	if ( age1 > age2 )
    		return 1;
    	else if ( age1 < age2 )
    		return -1;
    	else return 0;
    }
}


