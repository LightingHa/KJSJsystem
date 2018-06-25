package com.slsd.service;

import java.util.List;
import java.util.Map;
import com.slsd.entity.Users;

/**
 * 用户
 * @author Administrator
 *
 */
public interface UsersService {
	
	/**
	 * 添加用户信息
	 * @param user 用户
	 * @return 
	 */
	public boolean addUsers(Users user);
	
	/**
	 * 删除用户信息
	 * @param uid  用户id
	 * @return	
	 */
	public boolean delUsers(int uid);
	
	/**
	 * 更新用户信息  
	 * @param user  用户
	 * @return	
	 */
	public boolean editUsers(Users user);
	
	
	/**
	 * 得到所有用户信息  
	 * @return   list集合
	 */
	public List<Users> getAllUsers();
	
	
	/**
	 *通过uid得到用户信息 
	 * @param uid  用户id
	 * @return  单条用户信息
	 */
	public Users getUsersByUid(int uid);
	
	
	/**
	 * 分页得到所有用户信息
	 * @param map  键值对<String, Integer>
	 * @return  list集合
	 */
	public List<Users> getUsersByPage(Map<String, Integer> map);
}
