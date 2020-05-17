package in.codersclub.javatechs.dao;

import java.util.List;

import in.codersclub.javatechs.dom.ZodiacSign;

public interface ZodiacSignDao
{
	public List<ZodiacSign> getAllZodiacSigns();
	
	public ZodiacSign getZodiacSign(String date, String month);
}


