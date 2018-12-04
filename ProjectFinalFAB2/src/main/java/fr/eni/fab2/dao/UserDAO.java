package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.User;

public interface UserDAO {
	
	public void add(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public List<User> findAll();

}
