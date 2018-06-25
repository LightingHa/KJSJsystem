package com.slsd.entity;

/**
 * 照片
 * @author Administrator
 *
 */
public class Photos {
	private  int pid;			
	private Users user;		//所属用户
	private String paddress;		//图片存放地址
	private String pgroup;			//图片分组
	private Talks talk;     // 表字段tid
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPgroup() {
		return pgroup;
	}
	public void setPgroup(String pgroup) {
		this.pgroup = pgroup;
	}
	public Talks getTalk() {
		return talk;
	}
	public void setTalk(Talks talk) {
		this.talk = talk;
	}
	public Photos(int pid, Users user, String paddress, String pgroup, Talks talk) {
		super();
		this.pid = pid;
		this.user = user;
		this.paddress = paddress;
		this.pgroup = pgroup;
		this.talk = talk;
	}
	public Photos() {
		super();
	}
	public Photos(int pid, Users user, String paddress) {
		super();
		this.pid = pid;
		this.user = user;
		this.paddress = paddress;
	}
	public Photos(Users user, String paddress, String pgroup, Talks talk) {
		super();
		this.user = user;
		this.paddress = paddress;
		this.pgroup = pgroup;
		this.talk = talk;
	}
	@Override
	public String toString() {
		return "Photos [pid=" + pid + ", user=" + user + ", paddress=" + paddress + ", pgroup=" + pgroup + ", talk="
				+ talk + "]";
	}
	
	
	
	
	
	
}
