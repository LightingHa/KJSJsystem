package com.slsd.entity;

import java.util.Date;
import java.util.List;

/**
 * 说说
 * @author Administrator
 *
 */
public class Talks {
	private int tid;
	private Users user;			
	private Date  tdate;   //说说的时间
	private String ttext;  //说说文字内容
	private List<Photos> plist;  //照片集合
	private char ttype;   //  0-正常	  1-被举报	 1-违规

	private List<Likes> llist;   //点赞集合
	
	private List<Comments> clist;  // 评论集合

	public Talks() {
		super();
	}

	
	public Talks(Users user, Date tdate, String ttext, char ttype) {
		super();
		this.user = user;
		this.tdate = tdate;
		this.ttext = ttext;
		this.ttype = ttype;
	}


	public Talks(int tid, Users user, Date tdate, String ttext, List<Photos> plist, char ttype) {
		super();
		this.tid = tid;
		this.user = user;
		this.tdate = tdate;
		this.ttext = ttext;
		this.plist = plist;
		this.ttype = ttype;
	}

	//not null
	public Talks(int tid, Users user, char ttype) {
		super();
		this.tid = tid;
		this.user = user;
		this.ttype = ttype;
	}


	public Talks(int tid, Users user, Date tdate, String ttext, List<Photos> plist, char ttype, List<Likes> llist,
			List<Comments> clist) {
		super();
		this.tid = tid;
		this.user = user;
		this.tdate = tdate;
		this.ttext = ttext;
		this.plist = plist;
		this.ttype = ttype;
		this.llist = llist;
		this.clist = clist;
	}



	@Override
	public String toString() {
		return "Talks [tid=" + tid + ", user=" + user + ", tdate=" + tdate + ", ttext=" + ttext + ", plist=" + plist
				+ ", ttype=" + ttype + ", llist=" + llist + ", clist=" + clist + "]";
	}


	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public String getTtext() {
		return ttext;
	}

	public void setTtext(String ttext) {
		this.ttext = ttext;
	}

	public List<Photos> getPlist() {
		return plist;
	}

	public void setPlist(List<Photos> plist) {
		this.plist = plist;
	}

	public char getTtype() {
		return ttype;
	}

	public void setTtype(char ttype) {
		this.ttype = ttype;
	}

	public List<Likes> getLlist() {
		return llist;
	}

	public void setLlist(List<Likes> llist) {
		this.llist = llist;
	}

	public List<Comments> getClist() {
		return clist;
	}

	public void setClist(List<Comments> clist) {
		this.clist = clist;
	}
	
	
}
