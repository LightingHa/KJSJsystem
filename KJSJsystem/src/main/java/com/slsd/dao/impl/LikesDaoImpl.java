package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.LikesDao;
import com.slsd.entity.Likes;

/**
 * 点赞
 * @author Administrator
 *
 */
@Repository("likesdao")
public class LikesDaoImpl extends SqlSessionDaoSupport implements LikesDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	/**
	 * 添加点赞
	 * @param likes
	 * @return
	 */
	public int addLikes(Likes likes) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.insert("addLikes", likes);
		return row;
	}

	/**
	 * 删除点赞
	 * @param lid
	 * @return
	 */
	public int delLikes(int lid) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.delete("delLikes", lid);
		return row;
	}

	/**
	 * 更新点赞
	 * @param likes
	 * @return
	 */
	public int editLikes(Likes likes) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.update("editLikes", likes);
		return row;
	}

	/**
	 * 得到该说说的所有点赞
	 * @param ltid
	 * @return
	 */
	public List<Likes> getLikesByLtid(int ltid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Likes> llist=sqlSession.selectList("getLikesByLtid", ltid);
		return llist;
	}

	/**
	 * 得到该说说的所有点赞（通过ldate排序）
	 * @param ltid 
	 * @return
	 */
	public List<Likes> getLikesByLtidOrderByLdate(int ltid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Likes> llist=sqlSession.selectList("getLikesByLtidOrderByLdate", ltid);
		return llist;
	}

	/**
	 * 得到该用户的所有点赞（通过ldate排序）
	 * @param luid
	 * @return
	 */
	public List<Likes> getLikesByLuidOrderByLdate(int luid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Likes> llist=sqlSession.selectList("getLikesByLuidOrderByLdate", luid);
		return llist;
	}

	/**
	 * 通过lid得到单条点赞信息
	 * @param lid
	 * @return
	 */
	public Likes getLikesByLid(int lid) {
		SqlSession sqlSession =this.getSqlSession();
		Likes likes=sqlSession.selectOne("getLikesByLid", lid);
		return likes;
		
	}

}
