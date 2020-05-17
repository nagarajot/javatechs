package in.codersclub.javatechs.dao;

import in.codersclub.javatechs.dom.District;
import java.util.List;

public interface DistrictDao
{
	public List<District> getDistrictsByState(String stateCode);
	public District search(String districtCode);
}





