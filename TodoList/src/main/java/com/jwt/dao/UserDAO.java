package com.jwt.dao;

import java.util.List;
import com.jwt.model.User;

public interface UserDAO {
	public void save(User user);
	public List<User> all();
	public void delete(User user);
	public User update(User user);
	public User findById(Integer userId);
	public User authenticate(String email, String password);
}
