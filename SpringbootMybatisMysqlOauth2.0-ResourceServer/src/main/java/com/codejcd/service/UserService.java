package com.codejcd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codejcd.dao.UserDao;
import com.codejcd.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> selectUserList() {
		return userDao.selectUserList();
	}
}
