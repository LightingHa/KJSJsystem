package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Comments;

public interface CommentsDao {
	
	/**
	 * 添加评论
	 * @param comments
	 * @return
	 */
	public int addComments(Comments comments);
	
	/**
	 * 删除评论
	 * @param cid
	 * @return
	 */
	public int delComments(int cid);
	
	/**
	 * 更新评论
	 * @param comments
	 * @return
	 */
	public int editComments(Comments comments);
	
	/**
	 * 通过cid得到单条评论信息
	 * @param cid
	 * @return
	 */
	public Comments getCommentsByCid(int cid);
	
	/**
	 * 通过ctid得到该评论的所有评论（根据时间排序）
	 * @param ctid
	 * @return
	 */
	public List<Comments> getCommentsByCtidOrderByCdate(int ctid);
	
	/**
	 * 通过cuid得到该用户的所有评论（根据时间排序）
	 * @param cuid
	 * @return
	 */
	public List<Comments> getCommentsByCuidOrderByCdate(int cuid);
	
	
}
