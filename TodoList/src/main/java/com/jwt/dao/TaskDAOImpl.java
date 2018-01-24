package com.jwt.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Task;

@Repository
public class TaskDAOImpl implements TaskDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Task task) {
		sessionFactory.getCurrentSession().saveOrUpdate(task);
	}

}
