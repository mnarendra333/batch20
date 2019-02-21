package com.pragim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stu")
public class Student {

	@Id
	@Column
	private int stuId;
	
	@Column(length=30,name="name")
	private String stuName;
	
	@Column
	private int age;
	
	

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", age="
				+ age + "]";
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
