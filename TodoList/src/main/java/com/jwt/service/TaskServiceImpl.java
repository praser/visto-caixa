package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.TaskDAO;
import com.jwt.model.Task;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskDAO dao;
	
	@Override
	@Transactional
	public void save(Task task) {
		dao.save(task);
	}

}
