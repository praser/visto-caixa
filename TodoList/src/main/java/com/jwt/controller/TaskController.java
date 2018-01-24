package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Task;
import com.jwt.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@RequestMapping(value="/tasks/new")
	public ModelAndView newTask(ModelAndView model) {
		model.setViewName("tasks/new");
		return model;
	}
	
	@RequestMapping(value="/tasks/createTask", method=RequestMethod.POST)
	public String create(@ModelAttribute Task task) {
		taskService.save(task);
		return "redirect:newTask";
	}
	
}
