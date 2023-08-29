package com.uaem.apirestgym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uaem.apirestgym.dao.IUserDao;
import com.uaem.apirestgym.domain.User;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao iUserDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> listUser() {
		return (List<User>) iUserDao.findAll();
	}

	@Override
	@Transactional
	public void save(User user) {
		iUserDao.save(user);
	}

	@Override
	@Transactional
	public void delete(User user) {
		iUserDao.delete(user);
	}

	@Override
	@Transactional(readOnly = true)
	public User findUser(User user) {
		return iUserDao.findById((long) user.getIdUser()).orElse(null);
	}

}
