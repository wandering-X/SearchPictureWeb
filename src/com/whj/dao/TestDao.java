package com.whj.dao;

import java.util.HashMap;
import java.util.List;

import com.whj.bean.User;

public interface TestDao {
	public int addUser(HashMap<String, String> users);
	public User login(HashMap<String, String> users);
	public List<User> getAllUsers();
}
