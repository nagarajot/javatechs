package in.codersclub.javatechs.dom;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Country
{
	private String code;
	private String name;
	private String continentCode;
	private String capital;
	private long area;
	private long population;
	private String island;
	private String harbour;
	
	public Country(String code, String name, String continentCode, String capital, long area, long population,
			String island, String harbour) {
		super();
		this.code = code;
		this.name = name;
		this.continentCode = continentCode;
		this.capital = capital;
		this.area = area;
		this.population = population;
		this.island = island;
		this.harbour = harbour;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinentCode() {
		return continentCode;
	}

	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getIsland() {
		return island;
	}

	public void setIsland(String island) {
		this.island = island;
	}

	public String getHarbour() {
		return harbour;
	}

	public void setHarbour(String harbour) {
		this.harbour = harbour;
	}

	
	
	
	
}

