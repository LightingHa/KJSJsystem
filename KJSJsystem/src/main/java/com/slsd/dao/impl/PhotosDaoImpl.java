package com.slsd.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.PhotosDao;
import com.slsd.entity.Photos;

@Repository("photosdao")
public class PhotosDaoImpl extends SqlSessionDaoSupport implements PhotosDao {

	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	/**
	 * 添加照片
	 * @param photos
	 * @return
	 */
	public int addPhotos(Photos photos) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.insert("addPhotos", photos);
		return row;
	}

	/**
	 * 删除照片
	 * @param pid
	 * @return
	 */
	public int delPhotos(int pid) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.delete("delPhotos", pid);
		return row;
	}

	/**
	 * 更新照片
	 * @param photos
	 * @return
	 */
	public int editPhotos(Photos photos) {
		SqlSession sqlSession =this.getSqlSession();
		int row=sqlSession.update("editPhotos", photos);
		return row;
	}

	/**
	 * 通过pid得到单条照片信息
	 * @param pid
	 * @return
	 */
	public Photos getPhotoByPid(int pid) {
		SqlSession sqlSession =this.getSqlSession();
		Photos photos=sqlSession.selectOne("getPhotoByPid", pid);
		return photos;
	}

	/**
	 * 通过puid得到该用户的所有照片
	 * @param puid
	 * @return
	 */
	public List<Photos> getPhotosByPuid(int puid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Photos> plist=sqlSession.selectList("getPhotosByPuid", puid);
		return plist;
	}

	/**
	 * 通过ptid得到该说说的所有照片
	 * @param ptid
	 * @return
	 */
	public List<Photos> getPhotosByPtid(int ptid) {
		SqlSession sqlSession =this.getSqlSession();
		List<Photos> plist=sqlSession.selectList("getPhotosByPtid", ptid);
		return plist;
	}

	/**
	 * 通过puid和Pgroup得到该用户的某个相册的照片
	 * @param map 0.puid 1.pgroup
	 * @return
	 */
	public List<Photos> getPhotosByPuidAndPgroup(Map<String, Object> map) {
		SqlSession sqlSession =this.getSqlSession();
		List<Photos> plist=sqlSession.selectList("getPhotosByPuidAndPgroup", map);
		return plist;
	}

	/**
	 * 得到该用户的所有pgroup
	 * @param map 0.Pgroup 1.puid
	 * @return
	 */
	public List<String> getPgroupByPuid(int puid) {
		SqlSession sqlSession =this.getSqlSession();
		List<String> slist=sqlSession.selectList("getPgroupByPuid", puid);
		return slist;
	}

}
