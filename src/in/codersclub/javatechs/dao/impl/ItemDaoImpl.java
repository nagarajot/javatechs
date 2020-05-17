package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codersclub.javatechs.dao.ItemDao;
import in.codersclub.javatechs.dom.Item;
import in.codersclub.javatechs.utils.JdbcUtilities;

public class ItemDaoImpl implements ItemDao
{

	@Override
	public List<Item> getItemsByCategory(String categoryCode) {

		Item item = null;
		List<Item> itemList = new ArrayList<Item>();
		
		String sql = "select * from items where category_code = ?";
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = JdbcUtilities.getConnection("dept_stores");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, categoryCode);
			
			resultSet = preparedStatement.executeQuery();
			
			while ( resultSet.next())
			{
				item = new Item(resultSet.getInt("item_id"),
						resultSet.getString("category_code"),
						resultSet.getString("description"),
						resultSet.getInt("price"));
	
				itemList.add(item);
			}
		}
		catch(SQLException sqle)
		{
			System.out.println("ItemDaoImpl.getItemsByCategory() " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(preparedStatement);
			JdbcUtilities.closeConnection(connection);
		}
		System.out.println("size = " + itemList.size());
		return itemList;
	}
}


