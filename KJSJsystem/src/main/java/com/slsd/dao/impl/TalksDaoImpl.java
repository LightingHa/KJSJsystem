package com.slsd.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.TalksDao;
import com.slsd.entity.Talks;
/**
 * 说说
 * @author Administrator
 *
 */
@Repository("talksdao")
public class TalksDaoImpl extends SqlSessionDaoSupport implements TalksDao {
	
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	/**
	 * 添加说说信息
	 * @param talks 说说信息
	 * @return 被操作的行数
	 */
	public int addTalks(Talks talks) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.insert("addTalks", talks);
		return row;
	}

	/**
	 * 删除说说
	 * @param tid 
	 * @return 被操作的行数
	 */
	public int delTalks(int tid) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.delete("delTalks", tid);
		return row;
	}
	
	/**
	 * 更新说说信息
	 * @param talks
	 * @return 被操作的行数
	 */
	public int editTalks(Talks talks) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.update("editTalks", talks);
		return row;
	}

	/**
	 * 通过tuid得到该用户的所有说说
	 * @param tuid
	 * @return list集合
	 */
	public List<Talks> getTalksByTuid(int tuid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Talks> tlist=sqlSession.selectList("getTalksByTuid", tuid);
		return tlist;
	}

	
	/**
	 * 通过tid得到单条说说信息
	 * @param tid
	 * @return 
	 */
	public Talks getTalksByTid(int tid) {
		SqlSession sqlSession =this.getSqlSession();
		Talks talks=sqlSession.selectOne("getTalksByTid", tid);
		return talks;
	}

	/**
	 * 分页得到该用户的所有说说（按发表时间）
	 * @param map  0.tuid 1.pageStart 2.pageSize
	 * @return
	 */
	public List<Talks> getTalksByPageAndTuidOrderByTdate(Map<String, Integer> map) {
		SqlSession sqlSession =this.getSqlSession();
		List<Talks> tlist=sqlSession.selectList("getTalksByPageAndTuidOrderByTdate", map);
		return tlist;
	}

}
