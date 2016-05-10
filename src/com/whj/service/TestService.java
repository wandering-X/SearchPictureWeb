package com.whj.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whj.bean.User;
import com.whj.dao.TestDao;
import com.whj.serviceImpl.TestServiceImpl;

@Service
public class TestService implements TestServiceImpl{

	@Autowired
	private TestDao testDao;
	@Override
	public boolean addUser(String username, String password) {
		HashMap<String, String> users = new HashMap<String, String>();
		users.put("username", username);
		users.put("password", password);
		int i =testDao.addUser(users);
		System.out.println("i========>"+i);
		return true;
	}
	@Override
	public User login(String username, String password) {
		HashMap<String, String> users = new HashMap<String, String>();
		users.put("username", username);
		users.put("password", password);
		User user =testDao.login(users);
		if(user==null){
			System.out.println("username or password is error!");
		}else{
			System.out.println(user.toString());
		}
		
		return user;
	}
	@Override
	public List<User> showAllUsers() {
		System.out.println("service showAllUsers");
		return testDao.getAllUsers();
	}

}
