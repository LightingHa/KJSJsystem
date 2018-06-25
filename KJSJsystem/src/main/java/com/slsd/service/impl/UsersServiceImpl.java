package com.slsd.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.UsersDao;
import com.slsd.entity.Users;
import com.slsd.service.UsersService;

@Service("UsersService")
public class UsersServiceImpl implements UsersService {
	
	@Resource
	private UsersDao userdao;
	
	
	public boolean addUsers(Users user) {
		return (userdao.addUsers(user)>0)?true:false;
	}

	public boolean delUsers(int uid) {
	
		return (userdao.delUsers(uid)>0)?true:false;
	}

	public boolean editUsers(Users user) {
		return (userdao.editUsers(user)>0)?true:false;
	}

	public List<Users> getAllUsers() {
		return userdao.getAllUsers();
	}

	public Users getUsersByUid(int uid) {
		return userdao.getUsersByUid(uid);
	}

	public List<Users> getUsersByPage(Map<String, Integer> map) {
		return userdao.getUsersByPage(map);
	}

}
