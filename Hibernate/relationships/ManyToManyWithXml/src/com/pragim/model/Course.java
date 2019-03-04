package com.pragim.model;

import java.util.Set;

public class Course {

	private int cId;
	private String cName;
	private int duration;

	private Set<Student> students;

	

	public void setcId(int cId) {
		this.cId = cId;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public int getDuration() {
		return duration;
	}

	public Set<Student> getStudents() {
		return students;
	}

}
