package com.sqt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sqt.pojo.User;
import com.sqt.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/toLogin")
	public String toLogin(User user){
		return "login";
	}
	
	@ResponseBody
	@RequestMapping("/findList")
	public List<User> findList(){
		List<User> userList = userService.findList();
		return userList;
	}
}
