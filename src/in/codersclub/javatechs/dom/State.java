package in.codersclub.j2eedemo.dom;

public class State
{
	private String stateCode;
	private String name;
	private String capital;
	private String stateOrUt;
	private int population;
	
	public State(String stateCode, String name, String capital, String stateOrUt, int population) {
		super();
		this.stateCode = stateCode;
		this.name = name;
		this.capital = capital;
		this.stateOrUt = stateOrUt;
		this.population = population;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getStateOrUt() {
		return stateOrUt;
	}

	public void setStateOrUt(String stateOrUt) {
		this.stateOrUt = stateOrUt;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}



