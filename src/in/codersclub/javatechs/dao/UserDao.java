package in.codersclub.javatechs.dao;

import in.codersclub.javatechs.dom.User;
import in.codersclub.javatechs.exceptions.UserNotFoundException;

public interface UserDao
{
	public void validate(User user) throws UserNotFoundException;
}