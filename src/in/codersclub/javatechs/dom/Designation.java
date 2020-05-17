package in.codersclub.javatechs.dom;

public class Designation
{
	private String designationId;
	private String name;

	public Designation(String designationId, String name) {
		super();
		this.designationId = designationId;
		this.name = name;
	}
	
	public String getDesignationId() {
		return designationId;
	}
	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}