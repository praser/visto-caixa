package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	
	@SuppressWarnings("unchecked")
	public List<User> all(){
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}
	
	@Override
	public void delete(User user) {
		if (null != user) {
			this.sessionFactory.getCurrentSession().delete(user);
		}
	}
	
	public User findById(Integer userId) {
		return (User) sessionFactory.getCurrentSession().get(User.class, userId);
	}
	
	@Override
	public User update(User user) {
		sessionFactory.getCurrentSession().update(user);
		return user;
	}
	
	@Override
	public User authenticate(String email, String password) {
		return (User) sessionFactory.getCurrentSession().get(User.class, email);
	}
}
