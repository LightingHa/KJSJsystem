package com.slsd.entity;

import java.util.Date;

/**
 * 好友表
 * @author Administrator
 *
 */
public class Friends {
	private  int  fid;
	private  Users user;
	private Users user2;
	private String fnickname;// 昵称
	private int fdegree;// 亲密度
	private Date fvisttime;// 最后访问时间
	
	
	
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Users getUser2() {
		return user2;
	}
	public void setUser2(Users user2) {
		this.user2 = user2;
	}
	public String getFnickname() {
		return fnickname;
	}
	public void setFnickname(String fnickname) {
		this.fnickname = fnickname;
	}
	public int getFdegree() {
		return fdegree;
	}
	public void setFdegree(int fdegree) {
		this.fdegree = fdegree;
	}
	public Date getFvisttime() {
		return fvisttime;
	}
	public void setFvisttime(Date fvisttime) {
		this.fvisttime = fvisttime;
	}
	public Friends(int fid, Users user, Users user2, String fnickname, int fdegree, Date fvisttime) {
		super();
		this.fid = fid;
		this.user = user;
		this.user2 = user2;
		this.fnickname = fnickname;
		this.fdegree = fdegree;
		this.fvisttime = fvisttime;
	}
	public Friends() {
		super();
	}
	public Friends(int fid, Users user, Users user2, String fnickname, int fdegree) {
		super();
		this.fid = fid;
		this.user = user;
		this.user2 = user2;
		this.fnickname = fnickname;
		this.fdegree = fdegree;
	}
	public Friends(Users user, Users user2, String fnickname, int fdegree, Date fvisttime) {
		super();
		this.user = user;
		this.user2 = user2;
		this.fnickname = fnickname;
		this.fdegree = fdegree;
		this.fvisttime = fvisttime;
	}
	@Override
	public String toString() {
		return "Friends [fid=" + fid + ", user=" + user + ", user2=" + user2 + ", fnickname=" + fnickname + ", fdegree="
				+ fdegree + ", fvisttime=" + fvisttime + "]";
	}
	
	
}
