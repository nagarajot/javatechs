package in.codersclub.javatechs.dao;

import java.util.List;

import in.codersclub.javatechs.dom.Continent;
import in.codersclub.javatechs.exceptions.ContinentNotFoundException;


public interface ContinentDao
{
	public Continent search(String continentCode) throws ContinentNotFoundException;
	public List<Continent> getAllContinents();
}


