package com.slsd.entity;

import java.util.Date;
/**
 * 用户
 * @author Administrator
 *
 */
import java.util.List;
public class Users {
	private  int uid;	
	private String upwd;
	private String uname;
	private String umail;
	private String uheadportrait;  //用户头像地址
	private char usex;   //性别          0-男        1-女
	private int uage;		//年龄
	private Date ubirthday;	//生日
	private char ublood ;	//血型     0-A 1-B 2-AB 3-O
	private String uNowIn;	//现居地
	private String uhometown;	//故乡
	private char utype;		//类型   0-用户  1-管理员

	private List<Talks> tlist;   //说说集合
	
	private List<Friends> flist;  //好友集合
	
	private List<Photos> plist;  //照片集合

	
	
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", upwd=" + upwd + ", uname=" + uname + ", umail=" + umail + ", uheadportrait="
				+ uheadportrait + ", usex=" + usex + ", uage=" + uage + ", ubirthday=" + ubirthday + ", ublood="
				+ ublood + ", uNowIn=" + uNowIn + ", uhometown=" + uhometown + ", utype=" + utype + "]";
	}

	public Users(int uid, String upwd, String uname, String umail, String uheadportrait, char usex, int uage,
			Date ubirthday, char ublood, String uNowIn, String uhometown, char utype) {
		super();
		this.uid = uid;
		this.upwd = upwd;
		this.uname = uname;
		this.umail = umail;
		this.uheadportrait = uheadportrait;
		this.usex = usex;
		this.uage = uage;
		this.ubirthday = ubirthday;
		this.ublood = ublood;
		this.uNowIn = uNowIn;
		this.uhometown = uhometown;
		this.utype = utype;
	}

	public Users(int uid, String upwd, String uname, String umail, char utype) {
		super();
		this.uid = uid;
		this.upwd = upwd;
		this.uname = uname;
		this.umail = umail;
		this.utype = utype;
	}

	public Users() {
		super();
	}

	public Users(int uid, String upwd, String uname, String umail, String uheadportrait, char usex, int uage,
			Date ubirthday, char ublood, String uNowIn, String uhometown, char utype, List<Talks> tlist,
			List<Friends> flist, List<Photos> plist) {
		super();
		this.uid = uid;
		this.upwd = upwd;
		this.uname = uname;
		this.umail = umail;
		this.uheadportrait = uheadportrait;
		this.usex = usex;
		this.uage = uage;
		this.ubirthday = ubirthday;
		this.ublood = ublood;
		this.uNowIn = uNowIn;
		this.uhometown = uhometown;
		this.utype = utype;
		this.tlist = tlist;
		this.flist = flist;
		this.plist = plist;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUmail() {
		return umail;
	}

	public void setUmail(String umail) {
		this.umail = umail;
	}

	public String getUheadportrait() {
		return uheadportrait;
	}

	public void setUheadportrait(String uheadportrait) {
		this.uheadportrait = uheadportrait;
	}

	public char getUsex() {
		return usex;
	}

	public void setUsex(char usex) {
		this.usex = usex;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public Date getUbirthday() {
		return ubirthday;
	}

	public void setUbirthday(Date ubirthday) {
		this.ubirthday = ubirthday;
	}

	public char getUblood() {
		return ublood;
	}

	public void setUblood(char ublood) {
		this.ublood = ublood;
	}

	public String getuNowIn() {
		return uNowIn;
	}

	public void setuNowIn(String uNowIn) {
		this.uNowIn = uNowIn;
	}

	public String getUhometown() {
		return uhometown;
	}

	public void setUhometown(String uhometown) {
		this.uhometown = uhometown;
	}

	public char getUtype() {
		return utype;
	}

	public void setUtype(char utype) {
		this.utype = utype;
	}

	public List<Talks> getTlist() {
		return tlist;
	}

	public void setTlist(List<Talks> tlist) {
		this.tlist = tlist;
	}

	public List<Friends> getFlist() {
		return flist;
	}

	public void setFlist(List<Friends> flist) {
		this.flist = flist;
	}

	public List<Photos> getPlist() {
		return plist;
	}

	public void setPlist(List<Photos> plist) {
		this.plist = plist;
	}

	
	
}
