package com.jnmd.liuwan.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.liuwan.domain.User;
import com.jnmd.liuwan.mapper.UserMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserService {
	
	@Resource
	private UserMapper userMapper;
	
//	//getUsers
//	@Transactional(propagation=Propagation.SUPPORTS)
//	public List<User> getUsers() {
//		return userMapper.getUsers();
//	}
	
	//getUser
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public User getUser(int uid) {
		return userMapper.getUser(uid);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public List<User> getUsers(Map<String, Object> map) {
		
		return userMapper.getUsers(map);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int maxNum() {
		
		return userMapper.maxNum();
	}



}
