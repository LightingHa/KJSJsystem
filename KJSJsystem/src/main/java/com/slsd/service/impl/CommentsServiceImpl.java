package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.CommentsDao;
import com.slsd.entity.Comments;
import com.slsd.service.CommentsService;

@Service("commentsService")
public class CommentsServiceImpl implements CommentsService {

	@Resource
	private CommentsDao commentsdao;
	
	public boolean addComments(Comments comments) {
		
		return (commentsdao.addComments(comments)>0)?true:false;
	}

	public boolean delComments(int cid) {
		
		return (commentsdao.delComments(cid)>0)?true:false;
	}

	public boolean editComments(Comments comments) {
		
		return (commentsdao.editComments(comments)>0)?true:false;
	}

	public Comments getCommentsByCid(int cid) {
		Comments comments=commentsdao.getCommentsByCid(cid);
		return comments;
	}

	public List<Comments> getCommentsByCtidOrderByCdate(int ctid) {
		List<Comments> clist=commentsdao.getCommentsByCtidOrderByCdate(ctid);
		return clist;
	}

	public List<Comments> getCommentsByCuidOrderByCdate(int cuid) {
		List<Comments> clist=commentsdao.getCommentsByCuidOrderByCdate(cuid);
		return clist;
	}

}
