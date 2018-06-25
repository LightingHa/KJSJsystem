package com.slsd.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.FriendsDao;
import com.slsd.entity.Friends;

/**
 * 好友表的增删查改
 * 
 * @author Administrator
 *
 */
@Repository("friendsdao")
public class FriendsDaoImpl extends SqlSessionDaoSupport implements FriendsDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	/**
	 * 增加好友信息
	 * @param friends 好友
	 * @return 被操作的行数
	 * @see com.slsd.dao.FriendsDao#addFriends(com.slsd.entity.Friends)
	 */
	public int addFriends(Friends friends) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.insert("addFriends", friends);
		return row;
	}

	/**
	* 删除好友信息
	 * @param friends 好友
	 * @return  被操作的行数
	* @see com.slsd.dao.FriendsDao#delFriends(com.slsd.entity.Friends)
	 */
	public int delFriends(int fid) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.delete("delFriends", fid);
		return row;
	}

	/**
	 * 更新好友信息
	 * @param friends 好友
	 * @return 被操作的行数
	* @see com.slsd.dao.FriendsDao#editFriends(com.slsd.entity.Friends)
	 */
	public int editFriends(Friends friends) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.update("editFriends", friends);
		return row;
	}

	/**
	 * 得到该用户的所有好友信息
	 * @param fuid
	 * @return
	* @see com.slsd.dao.FriendsDao#getFriendsByFuid(int)
	 */
	public List<Friends> getFriendsByFuid(int fuid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Friends> flist=sqlSession.selectList("getFriendsByFuid", fuid);
		return flist;
	}

	/**
	 * 通过fid得到该好友的信息
	 * @param fid
	 * @return
	* @see com.slsd.dao.FriendsDao#getFriendsByFid(int)
	 */
	public Friends getFriendsByFid(int fid) {
		SqlSession sqlSession =this.getSqlSession();
		Friends friends=sqlSession.selectOne("getFriendsByFid", fid);
		return friends;
	}

	/**
	* 分页得到该用户的所有好友的信息（按最后访问时间排序）
	 * @param map  0.fuid 1.pageStart 2.pageSize
	 * @return 该页的好友集合
	* @see com.slsd.dao.FriendsDao#getFriendsByPageAndFuidOrderByFvisttime(java.util.Map)
	 */
	public List<Friends> getFriendsByPageAndFuidOrderByFvisttime(Map<String, Integer> map) {
		SqlSession sqlSession =this.getSqlSession();
		List<Friends> flist=sqlSession.selectList("getFriendsByPageAndFuidOrderByFvisttime", map);
		return flist;
	}

	/**
	 * 分页得到该用户的所有好友的信息（按亲密度排序）
	 * @param map  0.fuid 1.pageStart 2.pageSize
	 * @return 该页的好友集合
	* @see com.slsd.dao.FriendsDao#getFriendsByPageAndFuidOrderByfdegree(java.util.Map)
	 */
	public List<Friends> getFriendsByPageAndFuidOrderByfdegree(Map<String, Integer> map) {
		SqlSession sqlSession =this.getSqlSession();
		List<Friends> flist=sqlSession.selectList("getFriendsByPageAndFuidOrderByfdegree", map);
		return flist;
	}

}
