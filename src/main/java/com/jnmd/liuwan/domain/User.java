package com.jnmd.liuwan.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private int uid ;
	private String uname;
	private String password;
	private String mphone;
	private int  countrycode;
	private Date birthday;	
	private String realname;
	private int sex;
	private int tid;
	private int papersid;
	private String paperscode;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getPapersid() {
		return papersid;
	}
	public void setPapersid(int papersid) {
		this.papersid = papersid;
	}
	public String getPaperscode() {
		return paperscode;
	}
	public void setPaperscode(String paperscode) {
		this.paperscode = paperscode;
	}
	public User(int uid, String uname, String password, String mphone, int countrycode, Date birthday, String realname,
			int sex, int tid, int papersid, String paperscode) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.mphone = mphone;
		this.countrycode = countrycode;
		this.birthday = birthday;
		this.realname = realname;
		this.sex = sex;
		this.tid = tid;
		this.papersid = papersid;
		this.paperscode = paperscode;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", mphone=" + mphone
				+ ", countrycode=" + countrycode + ", birthday=" + birthday + ", realname=" + realname + ", sex=" + sex
				+ ", tid=" + tid + ", papersid=" + papersid + ", paperscode=" + paperscode + "]";
	}
	
}
