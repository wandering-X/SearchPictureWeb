package com.whj.serviceImpl;

import java.util.List;

import com.whj.bean.User;

public interface TestServiceImpl {
	boolean addUser(String username,String password);
	User login(String username,String password);
	List<User> showAllUsers();
}
