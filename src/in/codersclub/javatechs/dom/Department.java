package in.codersclub.javatechs.dom;

public class Department
{
	private int deptNo;
	private String name;

	public Department(int deptNo, String name) {
		super();
		this.deptNo = deptNo;
		this.name = name;
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}