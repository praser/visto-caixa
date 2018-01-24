package com.jwt.service;

import java.util.List;

import com.jwt.model.User;

public interface UserService {
	public void save(User user);
	public List<User> all();
	public void delete(User user);
	public User findById(Integer userId);
	public User update(User user);
}
