package in.codersclub.javatechs.java.sampleprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriversSort {
    public static void main(String[] args)
    {
        List<Driver> driverList = new ArrayList<Driver>();
 
        Driver driver = null;
        driver = new Driver(1245,"Richard","M",23);
        driverList.add(driver);
        
        driver = new Driver(1245,"John","M",21);
        driverList.add(driver);
        
        driver = new Driver(876,"Bob","M",24);
        driverList.add(driver);
        
        driver = new Driver(4324,"Albert","M",22);
        driverList.add(driver);
 
        Collections.sort(driverList);

        for ( Driver d : driverList )
        {
            System.out.println(d.getId() + " "  + d.getName() + " " +d.getGender() + " " + d.getAge());
        }
    }
}




