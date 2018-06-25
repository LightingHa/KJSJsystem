package com.slsd.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.FriendsDao;
import com.slsd.entity.Friends;
import com.slsd.service.FriendsService;

@Service("FriendsService")
public class FriendsServiceImpl implements FriendsService {
	
	@Resource
	private FriendsDao  friendsdao;
	
	
	public boolean addFriends(Friends friends) {
		return (friendsdao.addFriends(friends)>0)?true:false;
	}

	public boolean delFriends(int fid) {
		return (friendsdao.delFriends(fid)>0)?true:false;
	}

	public boolean editFriends(Friends friends) {
		return (friendsdao.editFriends(friends)>0)?true:false;
	}

	public List<Friends> getFriendsByFuid(int fuid) {
		List<Friends> flist=friendsdao.getFriendsByFuid(fuid);
		return flist;
	}

	public Friends getFriendsByFid(int fid) {
		Friends friends=friendsdao.getFriendsByFid(fid);
		return friends;
	}

	public List<Friends> getFriendsByPageAndFuidOrderByFvisttime(Map<String, Integer> map) {
		List<Friends> flist=friendsdao.getFriendsByPageAndFuidOrderByFvisttime(map);
		return flist;
		
	}

	public List<Friends> getFriendsByPageAndFuidOrderByfdegree(Map<String, Integer> map) {
		List<Friends> flist=friendsdao.getFriendsByPageAndFuidOrderByfdegree(map);
		return flist;
	}

}
