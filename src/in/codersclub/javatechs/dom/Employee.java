package in.codersclub.javatechs.dom;

import java.sql.Date;

public class Employee
{
	private int employeeId;
	private String name;
	private String gender;
	private java.sql.Date dateOfBirth;
	private java.sql.Date dateOfJoining;
	private int deptNo;
	private String designationId;
	private int managerId;
	private String emailId;
	
	public Employee()
	{
		
	}
	
	public Employee(int employeeId, String name, String gender,
			Date dateOfBirth, Date dateOfJoining, int deptNo,
			String designationId, int managerId, String emailId) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.deptNo = deptNo;
		this.designationId = designationId;
		this.managerId = managerId;
		this.emailId = emailId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public java.sql.Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public java.sql.Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(java.sql.Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDesignationId() {
		return designationId;
	}
	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
 
	public String getEmailId()
	{
		return emailId;
	}
	
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
}
 
 