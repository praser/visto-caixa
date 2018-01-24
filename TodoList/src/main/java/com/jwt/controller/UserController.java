package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.User;
import com.jwt.service.UserService;

@Controller
public class UserController {
	
	public UserController() {
		System.out.println("UserController()");
	}
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users")
	public ModelAndView index(ModelAndView model) throws IOException {
		List<User> users = userService.all();
		model.addObject("users", users);
		model.setViewName("users/index");
		
		return model;
	}
	
	@RequestMapping(value="/users/new", method=RequestMethod.GET)
	public ModelAndView newUser(ModelAndView model) {
		User user = new User();
		model.addObject("user", user);
		model.setViewName("users/new");
		
		return model;
	}
	
	@RequestMapping(value="users", method=RequestMethod.POST)
	public String create(@ModelAttribute User user) {
		userService.save(user);
		return "redirect:index";
	}
}
