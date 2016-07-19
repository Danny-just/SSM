package edu.just.service;

import java.util.ArrayList;

import edu.just.model.User;

public interface UserService {
	public User getUserById(int userId);
	ArrayList<User> selectAllUser();
	String insertUser(User user);
	String deletById(int id);
	String insert(User user);
	String insertSelective(User user);
	String updateById(User user);
	String updateByIdSelective(User user);
}
