package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.UserDAO;
import com.jwt.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public void save(User user) {
		userDAO.save(user);
		
	}

	@Override
	@Transactional
	public List<User> all() {
		return userDAO.all();
	}

	@Override
	@Transactional
	public void delete(User user) {
		userDAO.delete(user);
		
	}

	@Override
	@Transactional
	public User findById(Integer userId) {
		return userDAO.findById(userId);
	}

	@Override
	@Transactional
	public User update(User user) {
		return userDAO.update(user);
	}
	
	public void setuserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
