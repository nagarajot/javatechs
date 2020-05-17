package in.codersclub.javatechs.dao;

import java.util.List;
import in.codersclub.javatechs.dom.Item;

public interface ItemDao
{
	public List<Item> getItemsByCategory(String cateogyCode);
}