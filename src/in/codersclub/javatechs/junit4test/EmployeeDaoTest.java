package in.codersclub.j2eedemo.junit4test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import in.codersclub.j2eedemo.dao.EmployeeDao;
import in.codersclub.j2eedemo.dao.impl.EmployeeDaoImpl;
import in.codersclub.j2eedemo.dom.Employee;
import in.codersclub.j2eedemo.exceptions.EmployeeNotFoundException;
import in.codersclub.j2eedemo.exceptions.ProcessingException;
import in.codersclub.j2eedemo.utils.JdbcUtilities;

public class EmployeeDaoTest {

	Connection connection;
	EmployeeDao employeeDao; 
	Employee employee;
	
	@Before
	public void setUp() throws Exception {
		connection = JdbcUtilities.getConnection("organization");
		employeeDao = new EmployeeDaoImpl();
		connection.setAutoCommit(false);
	}

	@After
	public void tearDown() throws Exception {
		connection.rollback();
		JdbcUtilities.closeConnection(connection);
	}

	@Test (expected = EmployeeNotFoundException.class)
	public void testSearch() throws EmployeeNotFoundException{
			employee = employeeDao.search(101);
			assertEquals("John",employee.getName());
			
			employee = employeeDao.search(888);
	}
	
	@Test
	public void testList() {
		assertEquals(4,employeeDao.getAllEmployees().size());
	}

	@Test (expected=ProcessingException.class)
	public void testInsert() throws ProcessingException{
		employee = new Employee(901,"Williams","M",28,"BE-CS","Kolkata");
		employeeDao.insert(employee);

		try
		{
			employee = employeeDao.search(901);
		}
		catch(EmployeeNotFoundException enfe)
		{
			fail("insert");
		}

		employee = new Employee(902,"Johnson","M",28,"BE-CS","Kolkata");
		employeeDao.insert(employee);
			
		employeeDao.insert(employee);
	}

	@Test ( expected = EmployeeNotFoundException.class)
	public void testDelete() throws EmployeeNotFoundException{
			employee = employeeDao.search(101);
			employeeDao.delete(employee.getEmployeeId());

			employee = employeeDao.search(101);
	}

	@Test (expected = EmployeeNotFoundException.class)
	public void testUpdate() throws EmployeeNotFoundException {
			employee = employeeDao.search(101);
			employee.setCity("Agra");
			employeeDao.update(employee);

			employee = employeeDao.search(101);
			assertEquals("Agra",employee.getCity());
			
			throw new EmployeeNotFoundException();
	}
}



