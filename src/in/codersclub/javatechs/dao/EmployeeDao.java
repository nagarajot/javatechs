package in.codersclub.javatechs.dao;

import java.util.List;

import in.codersclub.javatechs.dom.Employee;
import in.codersclub.javatechs.exceptions.EmployeeNotFoundException;
import in.codersclub.javatechs.exceptions.ProcessingException;

public interface EmployeeDao
{
 public void insert(Employee employee)
 throws ProcessingException;

 public int getNoOfRows();

 public List<Employee> getAllEmployees();
 
 // Overloaded, Starting chars
 public List<Employee> getAllEmployees(String name)
 throws EmployeeNotFoundException;

 public List<Employee> getAllEmployees(int offset, int count);
 
 public Employee search(int employeeId)
 throws EmployeeNotFoundException;

 public List<Employee> getEmployeesByGender(String gender);

 // Overloaded
 public List<Employee> getEmployeesByDeptNo(int deptNo)
 throws EmployeeNotFoundException;

  // Overloaded
 public List<Employee> getEmployeesByDeptNo(String deptNo[]);
 
 public void delete(int employeeId)
 throws EmployeeNotFoundException;

 public void update(int employeeNo, String name)
 throws EmployeeNotFoundException;

 public List<Employee> getEmployeesByDateOfBirth(
             java.sql.Date fromDate, java.sql.Date toDate)
 throws EmployeeNotFoundException;

 public List<Employee> getRetiringEmployeesAt60Years(String monthYear)
 throws EmployeeNotFoundException;
} 






