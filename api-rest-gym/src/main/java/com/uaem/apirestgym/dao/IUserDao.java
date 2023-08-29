package com.uaem.apirestgym.dao;

import org.springframework.data.repository.CrudRepository;

import com.uaem.apirestgym.domain.User;

public interface IUserDao extends CrudRepository<User, Long>{

}
