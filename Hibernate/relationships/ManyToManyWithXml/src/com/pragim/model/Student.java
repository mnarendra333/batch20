package com.pragim.model;

import java.util.Set;

public class Student {

	private int sId;
	private String sName;
	private String addr;

	private Set<Course> courses;


	public void setsId(int sId) {
		this.sId = sId;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public int getsId() {
		return sId;
	}

	public String getsName() {
		return sName;
	}

	public String getAddr() {
		return addr;
	}

	public Set<Course> getCourses() {
		return courses;
	}

}
