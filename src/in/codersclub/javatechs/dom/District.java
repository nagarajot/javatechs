package in.codersclub.javatechs.dom;

public class District
{
	private String districtCode;
	private String name;
	private String headQuarters;
	private String stateCode;
	private int area;
	private int population;
	private int noOfTaluks;

	public District(String districtCode, String name, String headQuarters, String stateCode, int area, int population,
			int noOfTaluks) {
		super();
		this.districtCode = districtCode;
		this.name = name;
		this.headQuarters = headQuarters;
		this.stateCode = stateCode;
		this.area = area;
		this.population = population;
		this.noOfTaluks = noOfTaluks;
	}
	
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadQuarters() {
		return headQuarters;
	}
	public void setHeadQuarters(String headQuarters) {
		this.headQuarters = headQuarters;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getNoOfTaluks() {
		return noOfTaluks;
	}
	public void setNoOfTaluks(int noOfTaluks) {
		this.noOfTaluks = noOfTaluks;
	}

	
}





