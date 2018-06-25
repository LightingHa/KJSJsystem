package com.slsd.dao;

import java.util.List;
import java.util.Map;

import com.slsd.entity.Friends;

/**
 * 好友表的增删查改
 * @author Administrator
 *
 */
public interface FriendsDao {
	
	/**
	 * 增加好友信息
	 * @param friends   好友
	 * @return 被操作的行数
	 */
	public int addFriends(Friends friends);
	
	/**
	 * 删除好友信息
	 * @param friends 好友
	 * @return  被操作的行数
	 */
	public int delFriends(int fid);
	
	/**
	 * 更新好友信息
	 * @param friends 好友
	 * @return 被操作的行数
	 */
	public int editFriends(Friends friends);
	
	/**
	 * 得到该用户的所有好友信息
	 * @param fuid 
	 * @return
	 */
	public List<Friends> getFriendsByFuid(int fuid);
	
	/**
	 * 通过fid得到该好友的信息
	 * @param fid
	 * @return
	 */
	public Friends getFriendsByFid(int fid);
	
	/**
	 * 分页得到该用户的所有好友的信息（按最后访问时间排序）
	 * @param map 0.fuid 1.pageStart 2.pageSize
	 * @return 该页的好友集合
	 */
	public List<Friends> getFriendsByPageAndFuidOrderByFvisttime(Map<String, Integer> map);
	
	/**
	 * 分页得到该用户的所有好友的信息（按亲密度排序）
	 * @param map  0.fuid 1.pageStart 2.pageSize
	 * @return 该页的好友集合
	 */
	public List<Friends> getFriendsByPageAndFuidOrderByfdegree(Map<String, Integer> map);
}
