package com.slsd.service;

import java.util.List;
import com.slsd.entity.Likes;

/**
 * 点赞表
 * @author Administrator
 *
 */
public interface LikesService {
	
	/**
	 * 添加点赞
	 * @param likes
	 * @return
	 */
	public boolean addLikes(Likes likes);
	
	/**
	 * 删除点赞
	 * @param lid
	 * @return
	 */
	public boolean delLikes(int lid);
	
	/**
	 * 更新点赞
	 * @param likes
	 * @return
	 */
	public boolean editLikes(Likes likes);
	
	/**
	 * 通过lid得到单条点赞信息
	 * @param lid
	 * @return
	 */
	public Likes getLikesByLid(int lid);
	
	/**
	 * 得到该说说的所有点赞
	 * @param ltid
	 * @return
	 */
	public List<Likes> getLikesByLtid(int ltid);
	
	/**
	 * 得到该说说的所有点赞（通过ldate排序）
	 * @param ltid 
	 * @return
	 */
	public List<Likes> getLikesByLtidOrderByLdate(int ltid);
	
	/**
	 * 得到该用户的所有点赞（通过ldate排序）
	 * @param luid
	 * @return
	 */
	public List<Likes> getLikesByLuidOrderByLdate(int luid);
 }
