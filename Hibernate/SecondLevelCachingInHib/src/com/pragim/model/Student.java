package com.pragim.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="student_table")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String addr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
