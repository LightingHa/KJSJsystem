package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.CommentsDao;
import com.slsd.entity.Comments;

@Repository("commentsdao")
public class CommentsDaoImpl extends SqlSessionDaoSupport implements CommentsDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	/**
	 * 添加评论
	 * @param comments
	 * @return
	 */
	public int addComments(Comments comments) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.insert("addComments", comments);
		return row;
	}

	/**
	 * 删除评论
	 * @param cid
	 * @return
	 */
	public int delComments(int cid) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.delete("delComments", cid);
		return row;
	}

	/**
	 * 更新评论
	 * @param comments
	 * @return
	 */
	public int editComments(Comments comments) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.update("editComments", comments);
		return row;
	}

	/**
	 * 通过cid得到单条评论信息
	 * @param cid
	 * @return
	 */
	public Comments getCommentsByCid(int cid) {
		SqlSession sqlSession =this.getSqlSession();
		Comments comment=sqlSession.selectOne("getCommentsByCid", cid);
		return comment;
	}

	/**
	 * 通过ctid得到该评论的所有评论（根据时间排序）
	 * @param ctid
	 * @return
	 */
	public List<Comments> getCommentsByCtidOrderByCdate(int ctid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Comments> clist=sqlSession.selectList("getCommentsByCtidOrderByCdate", ctid);
		return clist;
	}

	/**
	 * 通过cuid得到该用户的所有评论（根据时间排序）
	 * @param cuid
	 * @return
	 */
	public List<Comments> getCommentsByCuidOrderByCdate(int cuid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Comments> clist=sqlSession.selectList("getCommentsByCuidOrderByCdate", cuid);
		return clist;
	}

}
