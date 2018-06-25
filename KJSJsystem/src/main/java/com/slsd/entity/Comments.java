package com.slsd.entity;

import java.util.Date;

/**
 * 评论
 * @author Administrator
 *
 */
public class Comments {
	private int cid;				
	private Talks talk;				
	private Users users;			
	private String ctext;			
	private Comments comment;		//回复哪条评论的
	private Date cdate;				//评论发表的时间
	
	
	
	
	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", talk=" + talk + ", users=" + users + ", ctext=" + ctext + ", comment="
				+ comment + ", cdate=" + cdate + "]";
	}
	public Comments(Talks talk, Users users, String ctext, Comments comment, Date cdate) {
		super();
		this.talk = talk;
		this.users = users;
		this.ctext = ctext;
		this.comment = comment;
		this.cdate = cdate;
	}
	public Comments(int cid, Talks talk, Users users, String ctext) {
		super();
		this.cid = cid;
		this.talk = talk;
		this.users = users;
		this.ctext = ctext;
	}
	public Comments(int cid, Talks talk, Users users, String ctext, Comments comment, Date cdate) {
		super();
		this.cid = cid;
		this.talk = talk;
		this.users = users;
		this.ctext = ctext;
		this.comment = comment;
		this.cdate = cdate;
	}
	
	
	public Comments() {
		super();
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Talks getTalk() {
		return talk;
	}
	public void setTalk(Talks talk) {
		this.talk = talk;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getCtext() {
		return ctext;
	}
	public void setCtext(String ctext) {
		this.ctext = ctext;
	}
	public Comments getComment() {
		return comment;
	}
	public void setComment(Comments comment) {
		this.comment = comment;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	
}
