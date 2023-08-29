package com.uaem.apirestgym.service;

import java.util.List;

import com.uaem.apirestgym.domain.User;

public interface IUserService {
	
	public List<User> listUser();
	
	public void save(User user);
	
	public void delete(User user);
	
	public User findUser(User user);
	
}
