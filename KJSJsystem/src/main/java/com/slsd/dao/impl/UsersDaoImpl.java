package com.slsd.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.UsersDao;
import com.slsd.entity.Users;

@Repository("userdao")
public class UsersDaoImpl extends SqlSessionDaoSupport implements UsersDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	
	/**
	 * 添加用户信息
	* <p>Title: addUsers</p><br/>
	* <p>Description: </p>
	* @param user  用户
	* @return   被执行的行数
	* @see com.slsd.dao.UsersDao#addUsers(com.slsd.entity.Users)
	 */
	public int addUsers(Users user) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.insert("addUsers", user);
		return row;
	}

	
	/**
	 * 删除用户信息
	* <p>Title: delUsers</p>
	* <p>Description: </p>
	* @param uid  用户id
	* @return   被执行的行数
	* @see com.slsd.dao.UsersDao#delUsers(int)
	 */
	public int delUsers(int uid) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.delete("delUsers", uid);
		return row;
	}
	
	/**
	 * 更新用户信息
	* <p>Title: editUsers</p>
	* <p>Description: </p>
	* @param user  用户信息
	* @return  被执行的行数
	* @see com.slsd.dao.UsersDao#editUsers(com.slsd.entity.Users)
	 */
	public int editUsers(Users user) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.update("editUsers", user);
		return row;
	}
	
	/**
	 * 得到所有用户的信息
	* <p>Title: getAllUsers</p>
	* <p>Description: </p>
	* @return  用户信息集合
	* @see com.slsd.dao.UsersDao#getAllUsers()
	 */
	public List<Users> getAllUsers() {
		SqlSession sqlSession =this.getSqlSession();
		List<Users> ulist=sqlSession.selectList("getAllUsers");
		return ulist;
	}
	
	/**
	 * 通过uid得到单条用户的信息
	* <p>Title: getUsersByUid</p>
	* <p>Description: </p>
	* @param uid  用户id
	* @return  单条用户信息
	* @see com.slsd.dao.UsersDao#getUsersByUid(int)
	 */
	public Users getUsersByUid(int uid) {
		SqlSession sqlSession =this.getSqlSession();
		Users user=sqlSession.selectOne("getUsersByUid", uid);
		return user;
	}
	
	/**
	 * 分页查询用户信息
	* <p>Title: getUsersByPage</p>
	* <p>Description: </p>
	* @param map  键值对<String, Integer>
	* @return 该页的用户信息集合
	* @see com.slsd.dao.UsersDao#getUsersByPage(java.util.Map)
	 */
	public List<Users> getUsersByPage(Map<String, Integer> map) {
		SqlSession sqlSession =this.getSqlSession();
		List<Users> user=sqlSession.selectList("getUsersByPage", map);
		return user;
	}

}
