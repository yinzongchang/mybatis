package com.yin.inter;

import java.util.List;

import com.yin.model.User;

public interface IUserOperation {

	public User selectUserByIdInter(int id);
	
	public List<User> selectUsers(String userName);

	public void updateUser(User user);

	public void addUser(User user);

	public void delUser(int id);
	
}
