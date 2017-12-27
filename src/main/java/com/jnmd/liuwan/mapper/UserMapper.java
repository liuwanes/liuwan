package com.jnmd.liuwan.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jnmd.liuwan.domain.User;

@Repository
public interface UserMapper {

//	public List<User> getUsers();
	
	public List<User> getUsers(Map<String,Object> map);
	public User getUser(int uid);
	public int maxNum();
	
	public List<User> getAllTime(Map<String,Object> map);

}
