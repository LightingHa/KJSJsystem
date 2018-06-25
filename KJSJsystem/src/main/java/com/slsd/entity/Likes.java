package com.slsd.entity;

import java.util.Date;

/**
 * 点赞
 * @author Administrator
 *
 */
public class Likes {
	private int lid;	//点赞编号
	private Talks talk;	//说说
	private Users user;	//点赞用户
	private Date ldate; //点赞的时间
	
	

	
	public Likes(Talks talk, Users user, Date ldate) {
		super();
		this.talk = talk;
		this.user = user;
		this.ldate = ldate;
	}

	public Likes(int lid, Talks talk, Users user) {
		super();
		this.lid = lid;
		this.talk = talk;
		this.user = user;
	}

	public Likes(int lid, Talks talk, Users user, Date ldate) {
		super();
		this.lid = lid;
		this.talk = talk;
		this.user = user;
		this.ldate = ldate;
	}

	public Likes() {
		super();
	}



	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public Talks getTalk() {
		return talk;
	}

	public void setTalk(Talks talk) {
		this.talk = talk;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Date getLdate() {
		return ldate;
	}

	public void setLdate(Date ldate) {
		this.ldate = ldate;
	}

	@Override
	public String toString() {
		return "Likes [lid=" + lid + ", talk=" + talk + ", user=" + user + ", ldate=" + ldate + "]";
	}

	
	
	
	
}
