package com.codejcd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codejcd.entity.User;
import com.codejcd.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
    @RequestMapping("/user/list")
    public List<User> getUserList() {
    	return userService.selectUserList(); 
    }

}
