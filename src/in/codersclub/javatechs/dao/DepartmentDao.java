package in.codersclub.javatechs.dao;

import java.util.List;

import in.codersclub.javatechs.dom.Department;
import in.codersclub.javatechs.exceptions.DepartmentNotFoundException;


public interface DepartmentDao
{
	public Department search(int deptNo)
	throws DepartmentNotFoundException;
	
	public List<Department> getAllDepartments();
}


