package edu.just.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.just.dao.UserMapper;
import edu.just.model.User;
import edu.just.service.UserService;

@Service("UserService")
public class UserServiceImp implements UserService{
	@Resource
	private	UserMapper userMapper;
	String state = new String();
	@Override
	public User getUserById(int userId) {
		return this.userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public ArrayList<User> selectAllUser() {
		return this.userMapper.selectAllUser();
	}

	@Override
	public String insertUser(User user) {
		int insert = this.userMapper.insert(user);
		return returnState(insert);
	}

	@Override
	public String deletById(int id) {
		int deleteByPrimaryKey = this.userMapper.deleteByPrimaryKey(id);
		return returnState(deleteByPrimaryKey);
	}

	@Override
	public String insert(User user) {
		int insert = this.userMapper.insert(user);
		return returnState(insert);
	}

	@Override
	public String insertSelective(User user) {
		int insertSelective = this.userMapper.insertSelective(user);
		return returnState(insertSelective);
	}

	@Override
	public String updateById(User user) {
		int updateByPrimaryKey = this.userMapper.updateByPrimaryKey(user);
		return returnState(updateByPrimaryKey);
	}

	@Override
	public String updateByIdSelective(User user) {
		int updateSelective = this.userMapper.updateByPrimaryKeySelective(user);
		return returnState(updateSelective);
	}
	private String returnState(int restate){
		System.out.println(String.valueOf(restate));
		if(String.valueOf(restate).equals("1")){
			state = "200";
		}else{
			state = "500";
		}
		return state;
	}
}
