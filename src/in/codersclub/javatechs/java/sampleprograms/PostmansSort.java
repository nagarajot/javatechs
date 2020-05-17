package in.codersclub.javatechs.java.sampleprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostmansSort {
    public static void main(String[] args)
    {
        List<Postman> postmanList = new ArrayList<Postman>();
 
        Postman postman = null;
        postman = new Postman(1245,"Richard","M",23);
        postmanList.add(postman);
        
        postman = new Postman(1245,"John","M",21);
        postmanList.add(postman);
        
        postman = new Postman(876,"Bob","M",24);
        postmanList.add(postman);
        
        postman = new Postman(4324,"Albert","M",22);
        postmanList.add(postman);
 
        
        // Sort by name
        System.out.println("sort by name ...");
        PostmanNameComparator postmanNameComparator = new PostmanNameComparator();
        Collections.sort(postmanList, postmanNameComparator);
        for ( Postman p : postmanList )
        {
            System.out.println(p.getId() + " "  + p.getName() + " " + p.getGender() + " " + p.getAge());
        }
        
        // Sort by age
        System.out.println("sort by age ...");
        PostmanAgeComparator postmanAgeComparator = new PostmanAgeComparator();
        Collections.sort(postmanList, postmanAgeComparator);
        for ( Postman p : postmanList )
        {
            System.out.println(p.getId() + " "  + p.getName() + " " + p.getGender() + " " + p.getAge());
        }
        
    }
}




