package com.pragim.model;

import java.util.Set;

public class Parent {

	@Override
	public String toString() {
		return "Parent [parId=" + parId + ", parName=" + parName + ", age="
				+ age + "]";
	}

	private int parId;
	private String parName;
	private int age;

	// to hold the list of chailds we need to have a collection
	private Set<Child> childs;

	public int getParId() {
		return parId;
	}

	public void setParId(int parId) {
		this.parId = parId;
	}

	public String getParName() {
		return parName;
	}

	public void setParName(String parName) {
		this.parName = parName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Child> getChilds() {
		return childs;
	}

	public void setChilds(Set<Child> childs) {
		this.childs = childs;
	}

}
