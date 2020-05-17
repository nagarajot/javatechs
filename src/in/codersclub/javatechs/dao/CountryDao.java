package in.codersclub.javatechs.dao;

import java.util.List;

import in.codersclub.javatechs.dom.Country;
import in.codersclub.javatechs.exceptions.CountryNotFoundException;
import in.codersclub.javatechs.exceptions.ProcessingException;


public interface CountryDao
{
	public List<Country> getAllCountries();
	
	public Country search(String code) throws CountryNotFoundException;
	
    public List<Country> getAllCountries(String startingChars)
    throws CountryNotFoundException;

    public List<Country> getCountriesOfContinent(String continentCode);

    public int getCount();
    
    public void insert(Country country) throws ProcessingException;
}



