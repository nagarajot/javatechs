package in.codersclub.javatechs.dom;

public class Continent
{
	private String continentCode;
	private String name;

	public Continent()
	{
		
	}
	
	public Continent(String continentCode, String name) {
		super();
		this.continentCode = continentCode;
		this.name = name;
	}

	public String getContinentCode() {
		return continentCode;
	}

	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}







