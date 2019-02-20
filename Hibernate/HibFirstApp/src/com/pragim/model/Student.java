package com.pragim.model;

public class Student {

	private int stuId;
	private String stuName;
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
