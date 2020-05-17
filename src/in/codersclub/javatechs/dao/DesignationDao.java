package in.codersclub.javatechs.dao;

import java.util.List;

import in.codersclub.javatechs.dom.Designation;
import in.codersclub.javatechs.exceptions.DesignationNotFoundException;

public interface DesignationDao
{
	public Designation search(String designationId)
	throws DesignationNotFoundException;
	
	public List<Designation> getAllDesignations();
}


