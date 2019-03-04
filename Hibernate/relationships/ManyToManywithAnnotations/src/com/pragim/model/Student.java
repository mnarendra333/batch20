package com.pragim.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="stu_tab")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stu_seq")
    @SequenceGenerator(name = "stu_seq", sequenceName = "stu_seq")
	private int sId;
	
	private String sName;
	
	private String addr;

	
	@JoinTable(name="stu_course_tab",joinColumns={@JoinColumn(name="s_id")},inverseJoinColumns={@JoinColumn(name="c_id")})
	@ManyToMany(targetEntity=Course.class,cascade=CascadeType.ALL)
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
