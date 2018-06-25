package com.slsd.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.TalksDao;
import com.slsd.entity.Talks;
import com.slsd.service.TalksService;

@Service("TalksService")
public class TalksServiceImpl implements TalksService {

	@Resource
	private TalksDao talksdao;
	
	public boolean addTalks(Talks talks) {
		return (talksdao.addTalks(talks)>0)?true:false;
	}

	public boolean delTalks(int tid) {
		
		return (talksdao.delTalks(tid)>0)?true:false;
	}

	public boolean editTalks(Talks talks) {
		return (talksdao.editTalks(talks)>0)?true:false;
	}

	public List<Talks> getTalksByTuid(int tuid) {
		List<Talks> tlist=talksdao.getTalksByTuid(tuid);
		return tlist;
	}

	public Talks getTalksByTid(int tid) {
		Talks talks=talksdao.getTalksByTid(tid);
		return talks;
	}

	public List<Talks> getTalksByPageAndTuidOrderByTdate(Map<String, Integer> map) {
		List<Talks> tlist=talksdao.getTalksByPageAndTuidOrderByTdate(map);
		return tlist;
	}

}
