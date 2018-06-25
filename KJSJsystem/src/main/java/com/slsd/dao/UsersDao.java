package com.slsd.dao;

import java.util.List;
import java.util.Map;
import com.slsd.entity.Users;

/**
 * 用户表的增删查改
 * @author Administrator
 *
 */
public interface UsersDao {
		
	/**
	 * 添加用户信息
	 * @param user 用户
	 * @return 被操作的行数
	 */
	public int addUsers(Users user);
	
	/**
	 * 删除用户信息
	 * @param uid  用户id
	 * @return	被操作的行数
	 */
	public int delUsers(int uid);
	
	/**
	 * 更新用户信息  
	 * @param user  用户
	 * @return	被操作的行数
	 */
	public int editUsers(Users user);
	
	
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
