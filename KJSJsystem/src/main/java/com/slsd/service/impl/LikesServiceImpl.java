package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.LikesDao;
import com.slsd.entity.Likes;
import com.slsd.service.LikesService;

@Service("LikesService")
public class LikesServiceImpl implements LikesService {

	@Resource
	private LikesDao likesdao;
	
	public boolean addLikes(Likes likes) {
		return (likesdao.addLikes(likes)>0)?true:false;
	}

	public boolean delLikes(int lid) {
		return (likesdao.delLikes(lid)>0)?true:false;
	}

	public boolean editLikes(Likes likes) {
		return (likesdao.editLikes(likes)>0)?true:false;
	}

	public Likes getLikesByLid(int lid) {
		Likes likes=likesdao.getLikesByLid(lid);
		return likes;
	}

	public List<Likes> getLikesByLtid(int ltid) {
		List<Likes> llist=likesdao.getLikesByLtid(ltid);
		return llist;
	}

	public List<Likes> getLikesByLtidOrderByLdate(int ltid) {
		List<Likes> llist=likesdao.getLikesByLtidOrderByLdate(ltid);
		return llist;
	}

	public List<Likes> getLikesByLuidOrderByLdate(int luid) {
		List<Likes> llist=likesdao.getLikesByLuidOrderByLdate(luid);
		return llist;
	}

}
