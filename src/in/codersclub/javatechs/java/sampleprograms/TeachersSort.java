package in.codersclub.javatechs.java.sampleprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeachersSort {
    public static void main(String[] args)
    {
        List<Teacher> teacherList = new ArrayList<Teacher>();
 
        Teacher teacher = null;
        teacher = new Teacher(1245,"Richard","M",23);
        teacherList.add(teacher);
        
        teacher = new Teacher(124,"John","M",21);
        teacherList.add(teacher);
        
        teacher = new Teacher(87,"Bob","M",24);
        teacherList.add(teacher);
        
        teacher = new Teacher(43,"Albert","M",22);
        teacherList.add(teacher);
 
        Collections.sort(teacherList);

        for ( Teacher t : teacherList )
        {
            System.out.println(t.getId() + " "  + t.getName() + " " + t.getGender() + " " + t.getAge());
        }
    }
}




